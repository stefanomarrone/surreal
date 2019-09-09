#!/bin/bash

PACKAGECND=../src/org/surreal/samgen/modes/condition
PACKAGERES=../src/org/surreal/samgen/results
SABLEDIR=/home/stefano/local/sablecc-3.7/lib
BASE=../src

rm -rf $PACKAGE/node/*.java $PACKAGE/lexer/*.java $PACKAGE/parser/*.java $PACKAGE/analysis/*.java
java -jar $SABLEDIR/sablecc.jar -d $BASE/ Condition.sablecc

rm -rf $PACKAGERES/node/*.java $PACKAGERES/lexer/*.java $PACKAGERES/parser/*.java $PACKAGERES/analysis/*.java
java -jar $SABLEDIR/sablecc.jar -d $BASE/ Results.sablecc
