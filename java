#!/bin/bash
compiler=`javac Main.java`
if [ -z "$compiler" ]
then
start=`date +%s%N`
java Main < input > myoutput
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
else
echo "$comiler"
fi
exit 0

