# sbt-example

## Installation
You can find the instructions to instal java, scala, and sbt in https://github.com/Big-Data-ETSIT/P5_spark_batch

## Code

Simple example of sbt


```
# enter the scala folder
cd sbt-example/scala-example

# compile
sbt compile

# run tests
sbt test

# run program
sbt "runMain example.Main"

# package program
sbt package

# run from package (scala must be installed, care with version!)
scala -cp  target/scala-2.13/sbt-example_2.13-1.0.jar example.Main

# execute custom task
sbt "runMain example.Main"
```
