#include <stdio.h>
#include <pthread.h>
#include <semaphore.h>
#define N 5
#define LEFT (i+N-1)%N
#define RIGHT (i+1)%N
#define THINKING 0
#define HUNGRY 1
#define EATING 2
typedef int semaphore;
int state[N];
semaphore mutex = 1;
semaphore s[N];

void think(){
	printf("philosopher is thinking\n");
}

void eat(){
	printf("philosopher is eating\n");
}

void *philosopher(int *i){
	while(TRUE){
		think();
		take_forks(i);
		eat();
		put_forks(i);
	}
}

void take_forks(int i){
	down(&mutex);
	state[i]=HUNGRY;
	test(i);
	up(&mutex);
	down(&s[i]);
}

void put_forks(i){
	down(&mutex);
	state[i]=THINKING;
	test(LEFT);
	test(RIGHT);
	up(&mutex);
}

void test(i){
	if(state[i]==HUNGRY&&state[LEFT]!=EATING&&state[RIGHT]!=EATING){
		state[i]==EATING;
		up(&s[i]);
	}
}

int main(){
	pthread_t phil1, phil2, phil3, phil4, phil5;
	
	pthread_create(&phil1,NULL,philosopher,NULL);
	pthread_create(&phil2,NULL,philosopher,NULL);
	pthread_create(&phil3,NULL,philosopher,NULL);
	pthread_create(&phil4,NULL,philosopher,NULL);
	pthread_create(&phil5,NULL,philosopher,NULL);
	pthread_join(phil1, NULL);
	pthread_join(phil2, NULL);
	pthread_join(phil3, NULL);
	pthread_join(phil4, NULL);
	pthread_join(phil5, NULL);
	
	return 0;
}