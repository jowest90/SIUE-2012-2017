#!/bin/bash
if [ ! -f numbers ]; then echo 0 > numbers; fi
count=0
while [[ $count != 100 ]]; do
	if ln numbers numbers.lock; then
	count=`expr $count + 1`
	n=`tail -n 1 numbers`
	expr $n + 1 >> numbers
	rm numbers.lock
	fi
done