#!/bin/bash

sudo yum install nginx -y
sudo systemclt enable nginx
sudo systemctl start nginx

sudo yum install openjdk -y
java --version

