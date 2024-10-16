#!/usr/bin/env sh

PROJECT="CreatePurchase"
SRC="./src"
BIN="./bin"

echo "Compiling project ${PROJECT}..."
javac -d ${BIN} ${SRC}/*.java
printf "Compilation successful! now running...\n\n"

java -cp ${BIN} ${PROJECT}



