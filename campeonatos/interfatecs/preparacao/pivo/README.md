# Quem é o pivo?

## Enunciado

Zequinha está estudando métodos de ordenação na escola e ficou muito empolgado com o Quick Sort, devido à sua rapidez. Fez até uma implementação em sua linguagem de programação favorita. Pesquisando um pouco mais sobre os detalhes de implementação, ficou sabendo que a escolha do valor de referência utilizado para processar uma partição dos dados, o famoso pivô, é um aspecto crítico para o desempenho.

Se uma implementação descuidada do método tiver o azar de encontrar sequências particularmente ruins de pivôs em uma ordenação, o desempenho será degradado a ponto de, no limite, o Quick Sort se comparar com o Bubble Sort. 

Claro que isso seria um caso extremo para alguém muito azarado, mas esse alerta foi
suficiente para que Zequinha resolvesse melhorar sua escolha de pivôs. Dentre várias abordagens possíveis, ele se interessou pela que escolhe três valores contidos na partição a ser processada e seleciona como pivô aquele valor que não seja sozinho nem o menor nem o maior dos três. Por exemplo, entre os valores 23, 42 e 37, o pivô a ser escolhido por esse método seria o 37; para os valores 15, 30 e 15, o escolhido teria que ser o 15 mesmo, dada a repetição. Sua tarefa é ajudar seu amigo Zequinha a determinar o valor do pivô com base em 3 valores inteiros fornecidos para análise.

## Entrada

A entrada é composta por 3 inteiros separados por espaço em branco. Cada valor encontra-se na faixa que
vai de -2000000000 até + 2000000000.

## Saida

Imprimir o valor selecionado como pivô pelo critério exposto anteriormente.

## Casos de Teste

### Caso 1

- **Entrada:**

```
23 42 37
```

- **Saida:**

```
37
```

### Caso 2

- **Entrada:**

```
15 30 15
```

- **Saida:**

```
15
```

### Caso 3

- **Entrada:**

```
10 20 30
```

- **Saida:**

```
20
```