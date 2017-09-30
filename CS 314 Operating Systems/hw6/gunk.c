#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
typedef struct{
  char name[255];
  int size;
} Header;

void insert(char * gunk, char * add);
int list(char * gunk, int extractAll);
int extract(char * gunk, char * extract, int removeFile);

int main(int argc, char * argv[]){
	int flag, i;

  char * archive;
  char * file;
  char * read;

  printf("Initiating gunk...\n");
  while ((flag = getopt(argc, argv, "a:l:e:" )) != -1){
    switch(flag){
		case 'a' : //add
      archive = strdup(optarg);
      if ((access(archive, F_OK)) != -1){
		  for(i = optind; i < argc; i++){
			  printf("optind: %d\n", optind);
			  file = strdup(argv[i]);
			  insert(archive, file);
		  }
      }else{
		  archive = strdup(optarg);
		  FILE * gunk;
		  printf("Creating archive %s...\n", archive);
		  gunk = fopen(archive, "w");
		  fclose(gunk);
		  for(i = optind; i < argc; i++){
			  file = strdup(argv[i]);
			  insert(archive, file);
		  }
	  }
      break;
    case 'l' : //list
      read = strdup(optarg);
      list(read, 0);
      break;
    case 'r' : //remove
      archive = strdup(optarg);
      for(i = optind; i < argc; i++){
		  file = strdup(argv[i]);
		  extract(archive, file, 1);
	  }
      break;
    case 'e' : //extract
      archive = strdup(optarg);
      for(i = optind; i < argc; i++){
		  file = strdup(argv[i]);
		  extract(archive, file, 0);
	  }
	   if (optind == 3){
	read = strdup(optarg);
        printf("Extracting all files...\n");
        list(read, 1);
      }
      break;
    }
  }
  printf("done\n");
}

void insert(char * gunk, char * add){
	FILE * read;
	FILE * writer;
	int size = 0;
	int sizeOfFile, offset, i;
	char temp;
	char arch[255];
	char name[255];

	Header * newHeader = malloc(sizeof(Header));
	strcpy(newHeader->name, add);
	newHeader->size = 0;

	read = fopen(gunk, "r");
	fseek(read, 0, SEEK_END);
	size = ftell(read);
	rewind(read);    
	if ((fopen(add, "r")) != NULL){
		read = fopen(add, "r");
		fseek(read, 0, SEEK_END);
		sizeOfFile = ftell(read); 
		rewind(read);
	}else{
		printf("%s does not exist\n", add);
		return;
	}
	newHeader->size = sizeOfFile;

	strcpy(arch, add);
	read = fopen(gunk, "r");
  
	for(i=0; i<size; i += (4 + offset)){
		fseek(read, i, SEEK_SET);
		fread(&name, 255, 1, read);
		if (strcmp(arch, name) == 0){
			printf("This file is already in the archive!\n");
			return;
		}else{
			 i += 256;
			fseek(read, i, SEEK_SET);
			fread(&offset, 4, 1, read);
			i += (4 + offset);
		}
	}
	fclose(read);

	writer = fopen(gunk, "a");
	fwrite(newHeader, sizeof(Header), 1, writer);
	read = fopen(add, "r");
	while (!feof(read)){
		fread(&temp, 1, 1, read);
		if (feof(read)){
			break;
		}
		fwrite(&temp, 1, 1, writer);
	}
	fclose(writer);
	fclose(read);
	printf("%s has been added\n", add);
}

int list(char * gunk, int extractAll){
	FILE * reader;
  
	char name[255];
	int pointer = 0;
	int size;
	int offset;

	reader = fopen(gunk, "r");
	fseek(reader, 0, SEEK_END);
	size = ftell(reader);
	rewind(reader);
  
	printf("Size of %s: %d bytes\n", gunk, size);
	if(extractAll){
		printf("Extracting files:\n");
	}else{
		printf("This gunk contains:\n");
	}
	
	while(pointer < size){
		fseek(reader, pointer, SEEK_SET);
		fread(&name, 255, 1, reader);
		printf("%s\n", name);
		if (extractAll){
			//extract(gunk, name, 0);
		}
		pointer += 256;
		fseek(reader, pointer, SEEK_SET);
		fread(&offset, 4, 1, reader);
		pointer += (4 + offset);
	}
	fclose(reader);
}

int extract(char * gunk, char * extract, int removeFile){
	FILE * parser;
  FILE * output;

  char temp;
  char name[255];

  int i, size, count;
  int pointer = 0;

  parser = fopen(gunk, "r");
  fseek(parser, 0, SEEK_END);
  size = ftell(parser);
  rewind(parser);

  while(pointer < size){
    fseek(parser, pointer, SEEK_SET);
    fread(&name, 255, 1, parser); 
    if (strcmp(extract, name) == 0){
      printf("File found, extracting %s from %s...\n", extract, gunk);
      break;
    } else {
      pointer += 256;
      fseek(parser, pointer, SEEK_SET);
      fread(&count, 4, 1, parser);
      pointer += (4 + count);
    }
  }
  
  if((access(extract, F_OK)) != -1){
    printf("This file already exists in this directory, replace %s? (y/n)\n", extract);
    scanf("%c%*c", &temp);
    switch(temp){
    case 'y' :
      break;
    case 'n' :
      printf("Extraction canceled\n");
      exit(0);
	  break;
    }
  }

  pointer += 256;
  fseek(parser, pointer, SEEK_SET);
  fread(&count, 4, 1, parser);
  i = 0;
  output = fopen(extract, "w");
  while (i < count){
    fread(&temp, 1, 1, parser);
    fwrite(&temp, 1, 1, output);
    i++;
  }

  pointer -=256;
  
  fclose(parser);
  fclose(output);
  printf("Files have been successfully extracted\n");
}