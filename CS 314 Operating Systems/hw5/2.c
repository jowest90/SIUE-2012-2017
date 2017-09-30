#include <stdio.h>
#include <stdlib.h>

int main(int argc, char **argv) {

  int nc, nw, nl; // new character , new word, new line
  int tnc, tnw, tnl; // toal characters, total words, total line
  int state; // current posistion

  nc = nw = nl = 0; //Count for current file/ Position
  tnc = tnw = tnl = 0; //Total

  FILE* file;
  int i;
  char c;

  for (i = 1; i <= argc; i++){
    if (argc == 1)
      file = stdin;
    else{
      file = fopen(argv[i], "r");
      if (file == NULL) continue;
    }

    while ((c = getc(file)) != EOF) {
      nc++;
      tnc++;

      if (c == '\n'){
	nl++;
	tnl++;
      }
      
      if (c == ' ' || c == '\n' || c == '\t')
	state = 0;      
      else if (state == 0) {
	state = 1;
	nw++;
	tnw++;
      }
    }
	FILE * fPointer;
	
	fPointer = fopen("wc.saved", "w");
	
    if (argc > 1){
		fprintf(fPointer, "Line: %8d Word: %8d Characters: %8d %s\n", nl, nw, nc, argv[i]);
	}else{
		fprintf(fPointer, "%Line: %8d Word: %8d Characters: %8d\n", nl, nw, nc);
	}
	fclose(fPointer);
  }
  return 0;

}