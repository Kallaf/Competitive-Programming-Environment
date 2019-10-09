#!/bin/bash
gcc main.c
start=`date +%s%N`
./a.out < input > myoutput
end=`date +%s%N`
var=`diff myoutput output`
if [ -z "$var" ]
then
echo Accepted
else
echo Wrong answer
echo "$var"
fi
echo "execution time:" "$(($((end-start))/1000000))" "ms"
exit 0
