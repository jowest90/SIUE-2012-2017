#include <stdio.h>
#include <pthread.h>
#include <semaphore.h>

sem_t s1;
sem_t s2;
sem_t s3;

int main() {
pthread_t thread1, thread2, thread3;
void *f1();
pthread_create(&thread1,NULL,f1,1);
pthread_create(&thread2,NULL,f1,2);
pthread_create(&thread3,NULL,f1,3);
pthread_join(thread1, NULL);
pthread_join(thread2, NULL);
pthread_join(thread3, NULL);
return 0;
}

void *f1(int x){
	sem_init(&s1,0,1);
	sem_init(&s2,0,1);
	sem_init(&s3,0,1);
	sem_wait(&s1);
	sem_wait(&s2);
	sem_wait(&s3);
	sem_post(&s1);
	sem_post(&s2);
	sem_post(&s3);
	printf("%d\n", x);
	pthread_exit(0);
}