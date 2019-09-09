#!/bin/bash

SURREALREPOS=$PWD/htdocs
sudo docker rm -f surreal-web
sudo docker run -dit --name surreal-web -p 8081:80 -v "$SURREALREPOS":/usr/local/apache2/htdocs/ httpd:2.4
