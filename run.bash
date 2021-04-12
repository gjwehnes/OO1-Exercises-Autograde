echo "compile ./src"
javac -classpath .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:/run_dir/json-simple-1.1.1.jar:./jars/*  src/*.java -d ./bin

echo "run Test5.java"
java -jar "./jars/junit-platform-console-standalone-1.5.0.jar" --disable-banner --disable-ansi-colors --details-theme=ascii --details=tree -class-path ./bin -c TriangleClassifierTest
