#!/bin/bash
compiler=`javac main.java`
if [ -z "$compiler" ]
then
java Main < input > myoutput
var=`diff myoutput output`
if [ -z "$var" ]
then
echo Accepted
else
echo Wrong answer
echo "$var"
fi
else
echo "$comiler"
fi
exit 0

