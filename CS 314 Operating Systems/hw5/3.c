#include<stdio.h>
#include <sys/time.h>
#include <unistd.h>
#include <assert.h>

long nanosec(struct timeval t){
return((t.tv_sec*1000000+t.tv_usec)*1000);
}

int countFile(FILE *f){
    fseek(f, -1L, 2);
    int pos = ftell(f);
    pos++;
    return pos;
}
 
int main(int argc, char *argv[]){
	int count, time =0;
	int res;
	float avg;
	float sum = 0.0;
	struct timeval t1, t2;
    char character;
    FILE *in, *out;
	
	
 res=gettimeofday(&t1,NULL); assert(res==0);
    if (in =  fopen(argv[1],"r")){
        out = fopen("outfile.txt", "w");
        count = countFile(in);
        fseek(in, -1L, 2);     
 
        while (count !=0){
			res=gettimeofday(&t1,NULL); assert(res==0);
            character = fgetc(in);
            fputc(character, out);
            fseek(in, -2L, 1);
            count--;
			res=gettimeofday(&t2,NULL); assert(res==0);
			sum = sum + (nanosec(t2)-nanosec(t1));
			time++;
        }
    }
   
    fclose(in);
    fclose(out);
	avg = (sum*1.0)/time;
	printf("%f\n", avg);
}