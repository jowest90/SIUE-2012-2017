#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <sys/io.h>
#include <sys/mman.h>
#include <assert.h>
#include <sys/time.h>

long nanosec(struct timeval t){
return((t.tv_sec*1000000+t.tv_usec)*1000);
}

int main(int argc, char *argv[]){
	
	int time = 0;
	int res;
	float avg;
	float sum = 0.0;
	struct timeval t1, t2;
	
	FILE *in;
	in = fopen(argv[1],"r+");
	
	int i, j;
	int fd = open(argv[1], O_RDONLY);
	struct stat stats;
	fstat(fd, &stats);
	char* file = (char*) mmap(NULL, stats.st_size, PROT_WRITE, MAP_PRIVATE, fd, 0);
	
		char c;
		c = file[i];
		putchar(c);
		for(j=stats.st_size-1; j>=0;j--){
			res=gettimeofday(&t1,NULL); assert(res==0);
			c = file[j];
			fputc(c, in);
			res=gettimeofday(&t2,NULL); assert(res==0);
			sum = sum + (nanosec(t2)-nanosec(t1));
			time++;
		}
		
	fclose(in);
	avg = (sum*1.0)/time;
	printf("%f\n", avg);
}