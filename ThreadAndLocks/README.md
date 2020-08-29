# About this chapter

Threads and locks is the fundation of concurrency programming, and these examples represent some problems and features of using Threads, specifically with Java.utils.concurrency library

# How to run the projects

This path was build with groovy and gradle, so you could download [gradle](https://gradle.org/install/).

You can build all modules (exemples) at once, enter in this path `cd ConcurrencyModels/ThreadAndLocks` and just use the command `gradle build`

### Counting

This exercice has two version, the first version is Counting, covered in day 1 of this chapter, but the main class is the CountingAtomic, that was covered in day 2, if you want to change this just change `mainClassName` to `'counting.Counting'` in `Counting/build.gradle`.

Enter the project: `cd Counting/`

Run the project: `gradle run`

### WordCount

This exercice require the dump of wikipedia database in xlm that you can download [here](http://dumps.wikimedia.org/enwiki/) (its about 17Gb - 40Gb)
