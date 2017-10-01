/*
File: 	MaxFlow.c
Author: John West
Date: 12/08/16
Course: CS 456
Project: 03
*/

#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <sys/time.h>
#include <assert.h>

//nanosec(struct timeval t): to time the function
long nanosec(struct timeval t){
return((t.tv_sec*1000000+t.tv_usec)*1000);
}

int res;
long convert=1000;
float time; 
struct timeval t1, t2;
FILE *out;

//main(): to open the txt files and put them into the matching functions below.
int main(int argc, char *argv[]){
	FILE *in, *out;
	
	in = fopen(argv[1], "r");
	out = fopen("Out.txt", "w+");
	fprintf(out,"this is a test!");
	fclose(out);
	return 0;
}