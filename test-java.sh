rm -rf *.class &&
javac -source 1.3 -target 1.1 -g:none -O -d . *.java &&
jar cfe twophase.jar test *.class &&
rm -rf *.class &&
java -jar twophase.jar

