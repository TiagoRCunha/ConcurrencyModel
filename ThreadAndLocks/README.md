# Sobre este capítulo

_Threads and locks_ são a fundação da programação conconrrente, e esses exemplos representam alguns problemas e recursos em usar _threads_, específicamente com a biblioteca `Java.utils.concurrency`

Jump to: [Day 2](#Day-2), [Day 3](#Day-3)

Leia este documento em: [English](./README.en.md)

# Como rodar os projetos

Esta pasta foi criada com _groovy_ e _gradle_, então você poderia baixar o [gradle](https://gradle.org/install/).

Você pode buildar todos os módulos (exemplos) de uma vez, entre neste caminho `cd ConcurrencyModels/ThreadAndLocks` e simplesmete use o comando `gradle build`

Entre no projeto: `cd ThreadAndLocks/<nome-do-projeto>/`

Rode o projeto: `gradle run`

## Dia 1

### HelloWorld

O primeiro programa, tem apenas uma versão.

Existe uma chance de saída:

```
Hello from new thread
Hello from main thread
```

E uma chance de saída:

```
Hello from main thread
Hello from new thread
```

### Counting

Este exercício tem 3 versões, as duas primeira podem ser usadas por trocar para a _branch_:

`git checkout chap2-counting-race`

Cada vez que você rodar o projeto a saída muda

E depois:

`git checkout chap2-counting-synchronized`

Toda vez que você rodar o projeto a saída será `20000`

### Puzzle

Este exercício tem uma versão. Apenas garanta que você está na _branch_ _master_.

As vezes a saída será:

`The meaning of life is: 42`

E as vezes será:

`I don't know the answer`

E existe uma chance pequena da saida ser:

`The meaning of life is: 0`

### Philosopher

Para este dia, o exercício tem duas versões, você pode mudar para:

`git checkout chap2-dining-philosophers`

E então:

`git checkout chap2-dining-philosophers-fixed`

### Downloader

Para o dia 1, este exercício tem duas versões, no qual você pode trocar por:

`git checkout chap2-downloader`

E então:

`git checkout chap2-downloader-fixed`

os dois vão gerar um arquivo `test.html`

## Dia 2

[:top:](#Sobre-este-capítulo)

### Uninterrputible

Este exercício tem uma versão, então você pode continuar na _branch_ _master_.

### Interrputible

O mesmo que o de cima

### Philosopher (melhor)

Agora você pode mudar para outra versão do exercício _Philosopher_, primeiro com _timeout_:

`git checkout chap2-dining-philosophers-time-out`

E então: (Esta versão irá aparecer depois de _ConcurrentSortedList_)

`git checkout chap2-dining-philosophers-condition`

### ConcurrentSortedList

Este exercício tem uma versão, você pode continuar na _branch_ _master_

### Counting (melhor)

Outra versão do exercício _Counting_, mas com variáveis atômicas

`git checkout chap2-counting-atomic-variable`

## Dia 3

[:top:](#Sobre-este-capítulo)

### EchoServer

Este exercício tem duas versões, para mudar a versão olhe abaixo:

`git checkout chap2-echo-server`

E então:

`git checkout chap2-echo-server-better` (ou use o código que está na _master_)

### Downloader (melhor)

O mesmo projeto do dia um, porém com um recurso da biblioteca padrão do Java:

`git checkout chap2-downloader-better`

### WordCount

Este exercício requer um _dump_ do banco de dados do _wikipedia_ em xml que pode ser baixado [aqui](http://dumps.wikimedia.org/enwiki/) (é por volta de 17Gb - 40Gb).

Depois disto, desempacote o arquivo xml em `ThreadAndLocks/WordCount`, e renomeie para `enwiki.xml`

Este é o ultimo exercício deste capítulo, e tem quatro versões:

`git checkout chap2-word-count-producer-consumer` (Na minha máquina custou 3m 22s)

Então:

`git checkout chap2-word-count-synchronized-hash-map` (Na minha máquina este teste custou 4m 20s)

E então:

`git checkout chap2-word-count-concurrent-hash-map` (1m 32s :astonished:)

E pra terminar:

`git checkout chap2-word-count-bash-concurrent` (1m 13s :sunglasses:)

Tente testar com números deferentes de _counters_ na linha `11` de `WordCount.java`
