#!/bin/sh

# installation script for Scala sbt and JDK 8 on Ubuntu 
# tested on Cloud9

sudo apt-get update
sudo apt-get install apt-transport-https

echo "deb https://dl.bintray.com/sbt/debian /" | sudo tee -a /etc/apt/sources.list.d/sbt.list
sudo apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 642AC823
sudo add-apt-repository ppa:webupd8team/java

sudo apt-get update
sudo apt-get install sbt
sudo apt-get install oracle-java8-installer