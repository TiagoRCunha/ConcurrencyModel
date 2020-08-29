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

There is a chance to output:

```
Hello from new thread
Hello from main thread
```

And a chance to output:

```
Hello from main thread
Hello from new thread
```

### Counting

#### Switching between versions

This exercise has three version, the first two versions you can set by switching the branch:

`git checkout chap2-counting-race`

Each time you run the project the output changes

then:

`git checkout chap2-counting-synchronized`

Every time you run the project the output will be `20000`

### Puzzle

This exercise has one version. Just guarantee that you are in the master branch.

Sometimes the output will be:

`The meaning of life is: 42`

and sometimes will be:

`I don't know the answer`

and there is a small chance to output:

`The meaning of life is: 0`

### Philosopher

For this day, this exercise has two version, which you can switch to:

`git checkout chap2-dining-philosophers`

Then:

`git checkout chap2-dining-philosophers-fixed`

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
