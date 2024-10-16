#!/usr/bin/env sh

PROJECT="CreatePurchase"

ant compile

java -cp build ${PROJECT}

