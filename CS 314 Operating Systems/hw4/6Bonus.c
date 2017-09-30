#include <stdlib.h>
#include<stdio.h>
#include <sys/time.h>
#include <unistd.h>
#include <assert.h>

char *major;

long nanosec(struct timeval t){
return((t.tv_sec*1000000+t.tv_usec)*1000);
}

int main(void)
{
	int i, res;
	long convert=1000000;
	float avg; 
	struct timeval t1, t2;
	
	res=gettimeofday(&t1,NULL); assert(res==0);
        char* p = malloc(1 * 4096);
        for(i=0; i< 4096*1000; i+=4096){ //major (requiring I/O) page faults
		major = malloc( i * sizeof(char) );
	}
	res=gettimeofday(&t2,NULL); assert(res==0);
	
	avg = (nanosec(t2) - nanosec(t1))/convert;
	printf("Average time : %f\n",avg); 
    return 0;
}