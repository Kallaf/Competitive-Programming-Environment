#!/bin/bash
python3 main.py < input > myoutput
var=`diff myoutput output`
if [ -z "$var" ]
then
echo Accepted
else
echo Wrong answer
echo "$var"
fi
exit 0

