#!/bin/bash
javac -d classes src/*.java
cd classes
java PlantDriver
cd ..
