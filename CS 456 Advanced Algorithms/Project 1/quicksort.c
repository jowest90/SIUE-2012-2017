/*
File: 	QuickSort.c
Author: John West
Date: 9/20/16
Course: CS 456
Project: 01
*/

#include <stdio.h>
#include <stdlib.h>
#include <sys/time.h>
#include <assert.h>

#define ten 10
#define hun 100
#define thou 1000
#define tenthou 10000

long nanosec(struct timeval t){
return((t.tv_sec*1000000+t.tv_usec)*1000);
}

int res;
long convert=1000;
float time; 
struct timeval t1, t2;


/*
void partition(): finds the pivot, splits it in half, and sorts the first half.
*/
int partition(int a[], int p, int r){
	int piv, i, j;
	piv=a[r];
	i=p-1;
	int t;
	for (j=p; j <= r-1; j++){
		if (a[j] <= piv){
			i=i+1;
			t=a[j];
			a[j] = a[i];
			a[i]=t;
		}
	}
	t=a[i+1];
	a[i+1] = a[r];
	a[r]=t;
	return i+1;
}

/*
void quickSort(): inserts array into the partion and performs qucik sort until done
*/
void quickSort(int a[], int p, int r){
	int q;
	if(p<r){
		q = partition(a,p,r);
		quickSort(a,p,q-1);
		quickSort(a,q+1,r);
	}
}

/*
int bestCase(): Array is sorted
*/
void bestCase(int x){
	int a[x];
	
	for (int i = 0; i < x; i++) {//insert sorted array
		a[i] = i;
	}
	//Get time
	res=gettimeofday(&t1,NULL); assert(res==0);
	quickSort( a, 0, x-1);//do quicksort
	res=gettimeofday(&t2,NULL); assert(res==0);
	time = (nanosec(t2) - nanosec(t1));
	
	printf(" BestCase(msec): %f\n",time/convert);

}

/*
int main(): Array is randomized
*/
void averageCase(int x){
	int a[x];
	
	//randomized
	for (int i = 0; i < x; i++) {//Insert array
		a[i] = i;
	}
	
	for (int i = 0; i < x; i++) {//Shuffle array
    int t = a[i];
    int ri = rand() % x;
    a[i]= a[ri];
    a[ri] = t;
	}
	
	//Get time
	res=gettimeofday(&t1,NULL); assert(res==0);
	quickSort( a, 0, x-1);//do quicksort
	res=gettimeofday(&t2,NULL); assert(res==0);
	time = (nanosec(t2) - nanosec(t1));
	
	printf(" Average Case(msec): %f\n",time/convert);
}

/*
int main(): the array is revered
*/
void worstCase(int x){
	int a[x];
	
	for (int i = x-1; i >= 0; i--) {//insert & print to array in reverse
		a[i] = i;
	}
	
	//Get time
	res=gettimeofday(&t1,NULL); assert(res==0);
	quickSort( a, 0, x-1);//do quicksort
	res=gettimeofday(&t2,NULL); assert(res==0);
	time = (nanosec(t2) - nanosec(t1));
	
	printf(" WorstCase(msec): %f\n",time/convert);
}

/*
int main(): prints the time.
*/
int main(){
	//10
	printf("%d:\n",ten);
	bestCase(ten);
	averageCase(ten);
	worstCase(ten);
	//100
	printf("\n%d:\n",hun);
	bestCase(hun);
	averageCase(hun);
	worstCase(hun);
	//1000
	printf("\n%d:\n",thou);
	bestCase(thou);
	averageCase(thou);
	worstCase(thou);
	//10000
	printf("\n%d:\n",tenthou);
	bestCase(tenthou);
	averageCase(tenthou);
	worstCase(tenthou);

	return 0;
}