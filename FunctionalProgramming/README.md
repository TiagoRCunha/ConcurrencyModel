# Sobre este capítulo

_Functional Programming_ é um dos paradgmas da programação, tem como característica dados imutáveis, declarativo em vez de imperativo, e evita efeitos colaterais. Neste capítulo o autor escolhe usar [clojure](https://clojure.org/) porque podemos usar um subconjunto puramente funcional.

Pule para: [Dia 2](#Dia-2), [Dia 3](#Dia-3)

Leia este documento em: [English](./README.en.md)

# Como rodar os projetos

Os projetos neste capítulo dependem do [Leiningen](https://github.com/technomancy/leiningen/wiki/Packaging) para rodar os _clojure scripts_.

> ### Obs
>
> Este link irá redirecionar para as opções de _package manager_, que pensei que seria a melhor opção de instalação
>
> Se você está no ubuntu eu recomendaria usar a opção do [SDKMAN!](https://sdkman.io/sdks#leiningen)
>
> Se você está usando vscode eu recomendaria as extensões [clojure](https://marketplace.visualstudio.com/items?itemName=avli.clojure), [clojure-code](https://marketplace.visualstudio.com/items?itemName=jamesnorton.continuum) e [clojure-code](https://marketplace.visualstudio.com/items?itemName=williamlindsay.clojure-lint).
>
> Se você não consegue formatar seu código veja [este](https://marketplace.visualstudio.com/items?itemName=avli.clojure#manual-configuration) artigo sobre esta extensão "clojure"

Com tudo "setado":

Entre no projeto `cd ./FunctionalProgramming/<nome-do-projeto>`
Rode `lein repl` (em alguns projetos vamos usar `lein run`)

Isto iniciará um servidor nREPL que escuta as funções escritas no projeto.

## Dia 1

### Passeio em Clojure

Abra o terminal (ou cmd no windows), e rode `lein repl`

Você verá o seguinte _prompt_:

`user=>`

Agora podemos brincar com alguns códigos:

O maior número

```
user=> (max 3 5)
5
```

Um operador matemática.

```
user=> (+ 1 (* 2 3))
5
```

Definindo uma constante e arquivando com _def_ :

```
user=> (def meaning-of-life 42)
#'user/meaning-of-life
user=> meaning-of-life
42
```

Estruturas de condição:

```
user=> (if (< meaning-of-life 0) "negative" "non-negative")
"non-negative"
```

Existem algumas exceções que não são uma expressão _s_. Literais de vetor (matriz) são circundados por colchetes:

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

E mapear literais com chaves:

```
user=> (def me {:name "Paul" :age 45 :sex :male})
#'user/me
user=> (:age me)
45
```

Finalmente, as funções são definidas com `defn`, e os argumentos especificados como vetores:

```
user=> (defn percentage [x p] (* x (/ p 100.0)))
#'user/percentage
user=> (percentage 200 10)
20.0
```

### Sum

O primeiro programa, entre no projeto e execute `lein repl`, teste as funções abaixo:

Use `(time)` para ver quanto tempo cada função custa

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

O mesmo que o capítulo _thread and locks_, mas agora com clojure. Use o mesmo _dump_ xml da wikipedia. Você precisa executar `lein deps` para recuperar as dependências.

Coloque o `enwiki.xml` na raiz do projeto e então use` lein run`

## Dia 2

[:top:](#Sobre-este-capítulo)

### Reducers

Use `lein repl` e teste as seguintes funções:

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

## Dia 3

[:top:](#Sobre-este-capítulo)

### server (transcript handler 1)

Este exercício abrirá um servidor que aceita dados de transcrição e os traduz.

Use `lein run` e em outro terminal:

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

Este exercício usa o projeto `transcripthandler`,` tradutor` e `transcript_test`. Você precisa executar `lein deps` para recuperar as dependências. Em seguida, o `lein run` para cada projeto.

Deve ver esta saída para este projeto

```
2020-10-01 15:08:49.394:INFO:oejs.Server:jetty-7.6.1.v20120215
2020-10-01 15:08:49.517:INFO:oejs.AbstractConnector:Started SelectChannelConnector@0.0.0.0:3000
```