#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<sys/stat.h>
#include<unistd.h>
#include<sys/mman.h>
#include<fcntl.h>
#include <sys/time.h>
#include <assert.h>

#define PAGE_SIZE 4096

char major[4096*1000]; //major (requiring I/O) page faults
char *minor; //minor (reclaiming a frame) page faults

// you may use this to convert the contents of the timeval struct to ns
long nanosec(struct timeval t){
return((t.tv_sec*1000000+t.tv_usec)*1000);
}
						
int main(){
	
	int i;
	int res;
	long convert=1000000;
	float min, maj; 
	struct timeval t1, t2;

	//MINOR
	res=gettimeofday(&t1,NULL); assert(res==0);
	for(i=0; i< PAGE_SIZE; i++){//minor (reclaiming a frame) page faults
		minor = malloc( i * sizeof(char) );
	}
	res=gettimeofday(&t2,NULL); assert(res==0);
	
	min = (nanosec(t2) - nanosec(t1))/convert;
	
	//MAJOR
	res=gettimeofday(&t1,NULL); assert(res==0);
	for(i=0; i< 4096*1000; i+=4096){ //major (requiring I/O) page faults
		major[i]='a';
	}
	
	char garbage;
	int fd = open("/usr/bin/zip", O_RDONLY);
	struct stat stats;
	fstat(fd, &stats);
	char* mfile = (char*) mmap(NULL, stats.st_size, PROT_READ, MAP_PRIVATE, fd, 0);
	
	for(i=0; i< stats.st_size; i+=4096){ //major (requiring I/O) page faults: 54
		garbage = mfile[i];	
	}
	res=gettimeofday(&t2,NULL); assert(res==0);
	
	maj = (nanosec(t2) - nanosec(t1))/convert;
	
	printf("Average minor time : %f\n",min); 
	printf("Average major time : %f\n",maj);
	
		return 0;
}