#!/bin/bash

NUM_CPUS=$(nproc --all)

echo enabling all $NUM_CPUS cores

for (( i=1; i<NUM_CPUS; i++)); do
	CPU="/sys/devices/system/cpu/cpu$i/online"
	echo 1 > "$CPU"
	echo "${i} --> online"
done
