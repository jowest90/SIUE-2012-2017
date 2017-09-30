#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>

pthread_mutex_t mutex1, mutex2;
pthread_cond_t aArrived, bArrived;

void *threadA(){
	printf("a1\n");
	pthread_cond_signal( &aArrived );
	pthread_mutex_unlock( &mutex1 );
	pthread_cond_wait( &bArrived, &mutex1 );
	pthread_mutex_lock( &mutex2 );
	pthread_mutex_unlock( &mutex2 );
	pthread_cond_signal( &aArrived );
	printf("a2\n");
}

void *threadB(){
	printf("b1\n");
	pthread_cond_signal( &bArrived );
	pthread_mutex_unlock( &mutex2 );
	pthread_cond_wait( &aArrived, &mutex2 );
	pthread_mutex_lock( &mutex1 );
	printf("b2\n");
}

int main(){
	pthread_t thread1, thread2;
	
	pthread_create( &thread1, NULL, &threadA, NULL);
	pthread_create( &thread2, NULL, &threadB, NULL);
	
	pthread_join( thread1, NULL);
	pthread_join( thread2, NULL);
	
	pthread_exit(0);

}