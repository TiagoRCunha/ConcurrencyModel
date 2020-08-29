# About this chapter

Threads and locks is the fundation of concurrency programming, and these examples represent some problems and features of using Threads, specifically with `Java.utils.concurrency` library

Jump to: [Day 2](#Day-2), [Day 3](#Day-3)

Read this document in: [Português](./README.md)

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

For day 1, this exercise has two version, which you can switch to:

`git checkout chap2-downloader`

Then:

`git checkout chap2-downloader-fixed`

both will generate a file `test.html`

## Day 2

[:top:](#About-this-chapter)

### Uninterrputible

This exercise has one version, so you can continue in the branch master.

### Interrputible

Same as the last one

### Philosopher (better)

Now you can switch to another version of Philosopher exercise, first is with time out:

`git checkout chap2-dining-philosophers-time-out`

Then: (this version will appear after ConcurrentSortedList)

`git checkout chap2-dining-philosophers-condition`

### ConcurrentSortedList

This exercise has one version, so you can continue in the branch master

### Counting (better)

Another version of the Counting exercise, but with atomic variables

`git checkout chap2-counting-atomic-variable`

## Day 3

[:top:](#About-this-chapter)

### EchoServer

This exercise has two versions, to switch version check below:

`git checkout chap2-echo-server`

Then:

`git checkout chap2-echo-server-better` (or use the code in master branch)

### Downloader (better)

The same project at day one, but with a Java standard library resource:

`git checkout chap2-downloader-better`

### WordCount

This exercice require the dump of wikipedia database in xml that you can download [here](http://dumps.wikimedia.org/enwiki/) (its about 17Gb - 40Gb).

After that, unzip the xml file in `ThreadAndLocks/WordCount`, and rename to `enwiki.xml`

This is the last exercise of this chapition, and it has four version:

`git checkout chap2-word-count-producer-consumer` (In my machine this test cost 3m 22s)

then:

`git checkout chap2-word-count-synchronized-hash-map` (In my machine this test cost 4m 20s)

then:

`git checkout chap2-word-count-concurrent-hash-map` (1m 32s :astonished:)

and to end:

`git checkout chap2-word-count-bash-concurrent` (1m 13s :sunglasses:)

try to test different numbers of counters in line 11 of `WordCount.java`
