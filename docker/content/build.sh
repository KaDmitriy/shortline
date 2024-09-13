#!/bin/sh

VERSION=$1

docker build --build-arg version=$VERSION -t shortline/content:$VERSION .
