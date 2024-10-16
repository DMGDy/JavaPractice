#!/usr/bin/env sh

PROJECT="CreatePurchase"
SRC="src"
BIN="bin"

if [ ! -d ${BIN} ]; then
  echo "Creating directory ${BIN} for binary files"
  mkdir -p ${BIN}
else
  :
fi

echo "Compiling project ${PROJECT}..."
javac -d ${BIN} ${SRC}/*.java
printf "Compilation successful! now running...\n\n"

java -cp ${BIN} ${PROJECT}



