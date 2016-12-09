javac -cp src/ src/multi/util/*.java
javac -cp src/ src/multi/*.java
java -cp src/:src/multi/ MultiStdout
