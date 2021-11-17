#!/bin/bash

eval $(coursier java-home --jvm 11 --env)
cd 11 
sbt compile || true
rm -fr target project/target .bsp
cd ..

cd purejava
javac GraphOutput.java NoBug.java
javap -c NoBug.class
rm -fr *.class
cd ..

eval $(coursier java-home --jvm 8 --env)
cd 8 
sbt compile || true
rm -fr target project/target .bsp
cd ..

