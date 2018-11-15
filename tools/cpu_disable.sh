#!/bin/bash

TARGET_CPUS=1
NUM_CPUS=$(nproc --all)

echo disabling all but $TARGET_CPUS of $NUM_CPUS cores

for (( i=1; i<NUM_CPUS; i++)); do
	CPU="/sys/devices/system/cpu/cpu$i/online"
	echo 0 > "$CPU"
	echo "${i} --> offline"
done
