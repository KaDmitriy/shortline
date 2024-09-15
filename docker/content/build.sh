#!/bin/bash

filename="rootfs/version"
VERSION=0
APPLICATIONNAME=""
APPLICATIONFILE=""

function parseline {
	#echo "line=$1 $2"
	if [ "$1" = "Version:" ]; then
		VERSION=$2
	fi
}

while read -r line; do
    name="$line"
    parseline $line
done < "$filename"

if [ "$VERSION" != "0" ]; then
    echo "VERSION=$VERSION"
    docker build --build-arg version=$VERSION -t shortline/content:$VERSION .
else
   echo "ERROR: unspecified version!"
fi


