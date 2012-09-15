#!/bin/bash

j2objc test.java CoordCube.java CubieCube.java Search.java Tools.java Util.java &&
j2objcc -g -o twophase test.m CoordCube.m CubieCube.m Search.m Tools.m Util.m &&
rm -rf *.h *.m twophase.dSYM && # Comment this line to get the Objective C files.
./twophase