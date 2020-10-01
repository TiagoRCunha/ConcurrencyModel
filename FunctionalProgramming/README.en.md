# About this chapter

_Functional Programming_ is one of programming paradigms, has as a characteristic immutable data, declarative rather than imperative, and avoid side effects. This chapter the author choose to use [clojure](https://clojure.org/) because we can use purely functional subset.

Jump to: [Day 2](#Day-2), [Day 3](#Day-3)

Read this document in: [Português](./README.md)

# How to run projects

The projects on this chapter rely on [Leiningen](https://github.com/technomancy/leiningen/wiki/Packaging) to run clojure scripts.

> ### Note
>
> The link will redirects to package manager options, that I thought it would be the best installation option
>
> If you are on ubuntu I would recommend you to use [SDKMAN!](https://sdkman.io/sdks#leiningen) option
>
> If you are using vscode I would recommend you [clojure](https://marketplace.visualstudio.com/items?itemName=avli.clojure), [clojure-code](https://marketplace.visualstudio.com/items?itemName=jamesnorton.continuum) and [clojure-code](https://marketplace.visualstudio.com/items?itemName=williamlindsay.clojure-lint) extensions
>
> If you cant format your code see [this](https://marketplace.visualstudio.com/items?itemName=avli.clojure#manual-configuration) article of that extension "clojure"

With everything set up:

Enter the project `cd ./FunctionalProgramming/<project-name>`
Run `lein repl` (in some projects we will use `lein run`)

This will starts a nREPL server that it listens the functions witten on the project.

## Day one

### Tour of Clojure

Open a terminal (or cmd on windows), and run `lein repl`

You will see the following prompt:

`user=>`

Now we can play some code:

The biggest number

```
user=> (max 3 5)
5
```

Some mathematical operators.

```
user=> (+ 1 (* 2 3))
5
```

Defining a constant is achieved with def :

```
user=> (def meaning-of-life 42)
#'user/meaning-of-life
user=> meaning-of-life
42
```

Condition structures:

```
user=> (if (< meaning-of-life 0) "negative" "non-negative")
"non-negative"
```

There are a few exceptions that is not an s-expression. Vector (array) literals are surrouded by square brackets:

```
user=> (def droids ["Huey" "Dewey" "Louie"])
#'user/droids
user=> (count droids)
3
user=> (droids 0)
"Huey"
user=> (droids 2)
"Louie"
```

And map literals with curly brackets:

```
user=> (def me {:name "Paul" :age 45 :sex :male})
#'user/me
user=> (:age me)
45
```

Finally, functions are defined with `defn`, and the arguments specified as vectors:

```
user=> (defn percentage [x p] (* x (/ p 100.0)))
#'user/percentage
user=> (percentage 200 10)
20.0
```

### Sum

The first program, enter the project and run `lein repl`, test the functions bellow:

Use `(time)` to see how much time each function costs

```
sum.core=> (def numbers (into [] (range 0 10000000)))
#'sum.core/numbers
sum.core=> (time (reduce-sum numbers))
"Elapsed time: 480.501448 msecs"
49999995000000
sum.core=> (time (sum numbers))
"Elapsed time: 351.963756 msecs"
49999995000000
sum.core=> (time (parallel-sum numbers))
"Elapsed time: 336.448889 msecs"
49999995000000
```

### WordCount

Same as the thread and locks chapter, but now with clojure. Use the same xml dump of wikipedia. You need to run `lein deps` to retrive the dependencies.

Place the `enwiki.xml` on the root of the project and then use `lein run`

## Day 2

[:top:](#About-this-chapter)

### Reducers

Use `lein repl` and test the following functions:

```
reducers.core=> (def v (into [] (range 10000)))
#'reducers.core/v
reducers.core=> (my-fold + v)
49995000
reducers.core=> (my-fold + (my-map (partial * 2) v))
99990000
reducers.core=> (def numbers (into [] (take 10000000 (repeatedly #(rand-int 10)))))
#'reducers.core/numbers
reducers.core=> (require ['reducers.parallel-frequencies :refer :all])
nil
reducers.core=>  (time (frequencies numbers))
"Elapsed time: 2120.653785 msecs"
{0 999397, 7 1000544, 1 1000575, 4 1000341, 6 999152, 3 1000460, ...}
reducers.core=> (time (parallel-frequencies numbers))
"Elapsed time: 1209.062401 msecs"
{0 999397, 7 1000544, 1 1000575, 4 1000341, 6 999152, 3 1000460, ...}
```

## Day 3

[:top:](#About-this-chapter)

### server (transcript handler 1)

This exercise will open an server that accepts transcript data and translates it.

Use `lein run` and on another terminal:

```bash
$ curl -X put -d "Twas brillig, and the slithy toves" \
-H "Content-Type: text/plain" localhost:3000/snippet/0
```

```bash
curl -X put -d "All mimsy were the borogoves," \
-H "Content-Type: text/plain" localhost:3000/snippet/2
```

```bash
$ curl -X put -d "Did gyre and gimble in the wabe:" \
-H "Content-Type: text/plain" localhost:3000/snippet/1
```

### TranscriptHandler (2)

This exercise use the project `transcripthandler`, `translator` and `transcript_test`. You need to run `lein deps` to retrive the dependencies. Then the `lein run` for each projects.

Should see this output for this project

```
2020-10-01 15:08:49.394:INFO:oejs.Server:jetty-7.6.1.v20120215
2020-10-01 15:08:49.517:INFO:oejs.AbstractConnector:Started SelectChannelConnector@0.0.0.0:3000
```