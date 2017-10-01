/*
File: 	patternMatching.c
Author: John West
Date: 11/03/16
Course: CS 456
Project: 02
*/

#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#include <sys/time.h>
#include <assert.h>

void naive(char *T, char *P);
void rabinKarp(char *T, char *P,int d,int q);
int *computePrefix(char *P, int m);
void kmp(char *T, char *P, int n, int m);
char *array(FILE *f);

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
int main(){
	FILE *txt, *pat;
	int d,q;

	out = fopen("inputOut.txt", "w+");
	txt = fopen("input.txt", "r");
	pat = fopen("pattern.txt","r");
	
	char *t = array(txt);
	char *p = array(pat);
	
	printf("\nEnter a number 0-9: ");
	scanf("%d", &d);
	printf("\nEnter a prime number: ");
	scanf("%d", &q);
	
	
	//-----------------------------------------------------------------
	//NAIVE
	//-----------------------------------------------------------------
	fprintf(out," Naive:\n");
	res=gettimeofday(&t1,NULL); assert(res==0);
	naive(t,p);
	res=gettimeofday(&t2,NULL); assert(res==0);
	time = (nanosec(t2) - nanosec(t1));
	
	fprintf(out,"Average Naive time: %f\n",time/convert);
	
	//-----------------------------------------------------------------
	//Rabin-Karp
	//-----------------------------------------------------------------
	fprintf(out," Rabin-Karp:\n");
	res=gettimeofday(&t1,NULL); assert(res==0);
	rabinKarp(t,p,d,q);
	res=gettimeofday(&t2,NULL); assert(res==0);
	time = (nanosec(t2) - nanosec(t1));
	
	fprintf(out,"Average Rabin-Karp time: %f\n",time/convert);
	
	//-----------------------------------------------------------------
	//KMP
	//-----------------------------------------------------------------
	fprintf(out," kmp:\n");
	res=gettimeofday(&t1,NULL); assert(res==0);
	//kmp(t,p,strlen(t),strlen(p));
	res=gettimeofday(&t2,NULL); assert(res==0);
	time = (nanosec(t2) - nanosec(t1));
	
	fprintf(out,"Average KMP time: %f\n",time/convert);
	fclose(out);
	return 0;
}

char *array(FILE *f){
	fseek( f , 0 , SEEK_END);
    long length = ftell( f );
    rewind( f );

    char *buffer = calloc( 1, length );

	fread( buffer , length, 1 , f);

    fclose(f);
    return buffer;
}

//naive(char *T, char *P): 
void naive(char *T, char *P){
	char *ch = T;
	int n = strlen(T);
	int m = strlen(P);
	int i;
	for(i=0; i <= n-m; i++){
		if(P[i]==T[i+m]){
			 fprintf(out, "matched @: %s\n", ch + i);
		}//end if
	}//end for
}//end naive function

//rabinKarpMatcher(char *T, char *P, int d, int q): 
void rabinKarp(char *T, char *P, int d, int q){
	char *ch = T;
	int n = strlen(T);
	int m = strlen(P);
	int h=pow(d,m-1);
	int j=h%q;
	int p;
	int t;
	int i,s;
	for(i=1; i<m; i++){
		p=(d*p+P[i])%q;
		t=(d*t+T[i])%q;
	}//end for
	for(s=0; s < n-m; s++){
		if( p==t){
			if(P[s]==T[s+m]){
				fprintf(out,"matched @: %s\n", ch + s);
			}//end if
		}//end if
		if(s < n-m){
			t=(d*(t-T[s]*j)+T[s+m])%q;
		}//end if
	}//end for
}//end rabinKarpMatcher function

//computePrefix(char *P): 
int *computePrefix(char *P, int m){
	int k = 0;
	int i = 1;
	int *pi = malloc(sizeof(int)*m);
	pi[1] = 0;
	
	for (i = 2; i < m; i++) {
		while (k > 0 && P[k+1] != P[i]){
			k = pi[k];
		if (P[i] == P[k+1]){
			k++;
		}
		pi[i] = k;
		}
	}
	return pi;
}//end computePrefix function

//kmp(char *T, char *P): 
void kmp(char *T, char *P, int n, int m){
	char *ch = T;
	int i;
	int *pi = computePrefix(P, m);
	int q = 0;
	
	for (i = 0; i < n; i++) {
		while (q > 0 && P[q+1] != T[i])
			q = pi[q];
		if (T[i] == P[q+1])
			q++;
		if (q == m - 1) {
			free(pi);
			fprintf(out, "matched @: %s\n", ch + (i-m));
			q = pi[q];
		}
	}
	free(pi);
}//end kmp function
