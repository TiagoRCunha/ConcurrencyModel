# About this chapter

Threads and locks is the fundation of concurrency programming, and these examples represent some problems and features of using Threads, specifically with Java.utils.concurrency library

Jump to: [Day 2](#Day-2), [Day 3](#Day-3)

# How to run projects

This path was build with groovy and gradle, so you could download [gradle](https://gradle.org/install/).

You can build all modules (exemples) at once, enter in this path `cd ConcurrencyModels/ThreadAndLocks` and just use the command `gradle build`

Enter the project: `cd ThreadAndLocks/<project-name>/`

Run the project: `gradle run`

## Day 1

### HelloWorld

The first program, there is only one version.

### Counting

#### Switching between versions

This exercice has three version, the first two versions you can set by switching the branch:

`git checkout chap2-counting-race`

Each time you run the project the output changes

then:

`git checkout chap2-counting-synchronized`

Every time you run the project the output will be `20000`

### Puzzle

### Philosopher

### Downloader

## Day 2

[:top:](#About-this-chapter)

### Uninterrputible

### Interrputible

### Philosopher (better)

### ConcurrentSortedList

### Counting (better)

## Day 3

[:top:](#About-this-chapter)

### EchoServer

#### run the project

Enter the project: `cd ThreadAndLocks/HelloWorld/`

Run the project: `gradle run`

### Downloader (better)

#### run the project

Enter the project: `cd ThreadAndLocks/HelloWorld/`

Run the project: `gradle run`

### WordCount

This exercice require the dump of wikipedia database in xlm that you can download [here](http://dumps.wikimedia.org/enwiki/) (its about 17Gb - 40Gb).

After that, unzip the xml file in `ThreadAndLocks/WordCount`, and rename to `enwiki.xml`

#### run the project

Enter the project: `cd ThreadAndLocks/HelloWorld/`

Run the project: `gradle run`
