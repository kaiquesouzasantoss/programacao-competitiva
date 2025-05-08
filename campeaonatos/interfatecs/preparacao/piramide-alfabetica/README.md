# Piramide Alfabetica 

## Enunciado

Um famoso personagem, de um igualmente conhecido filme, disse a seguinte frase: "Palavras são, na minha nada humilde opinião, nossa inesgotável fonte de magia [...]". É claro que, para formar palavras, precisamos que exista um alfabeto com símbolos que permitam construí-las. Um exemplo é o nosso alfabeto latino. O alfabeto latino contém vinte e seis letras, iniciando com o caractere ’A’ e encerrando em ’Z’, se desconsiderarmos as acentuações e as diferenças entre letras maiúsculas e minúsculas. Hermione, uma garota muita estudiosa, percebeu que é possível desenhar usando letras do alfabeto latino. Em uma folha quadriculada de vinte e seis colunas, Hermione escreveu na 1ª linha e 26ª coluna o primeiro caractere do alfabeto. Na 2ª linha escreveu o primeiro e o segundo do alfabeto, ocupando a 25ª e a 26ª colunas, respectivamente. Na 3ª linha escreveu do 1º ao 3º caractere, preenchendo da 24ª à 26ª coluna. Com este procedimento, foi possível preencher a 26ª linha com todos os caracteres do alfabeto, em que ’A’ ocupou a 1ª coluna e ’Z’ ocupou a 26ª. Assim, formou-se uma "pirâmide alfabética", semelhante a um triângulo retângulo, como pode ser visualizado na Figura 1, supondo que o desenho parasse na 8ª linha. Hermione está ocupada estudando para uma prova de programação (que ela também considera como um tipo de magia!) e pediu sua ajuda para automatizar os desenhos das "pirâmides alfabéticas".

## Entrada

Um número natural N (1 ⩽ N ⩽ 26) e uma string P (P ∈ {maiusculas, minusculas}) (sem acentuação e em minúsculas), indicando se a pirâmide será composta só de letras maiúsculas ou minúsculas, respectivamente.

## Saida

Uma pirâmide alfabética com exatas N linhas e com letras maiúsculas ou minúsculas, conforme P, seguindo a mesma estratégia descrita no texto e ilustrada na figura e casos de teste de exemplo. Note que: (a) não há espaços entre os caracteres; (b) qualquer uma das vinte e seis colunas não ocupada por uma letra, será preenchida com um ponto ’.’ (sem apóstrofos) e; (c) toda linha é encerrada com uma quebra de linha.

## Casos de Teste

### Caso 1

- **Entrada:**

```
8 maiusculas
```

- **Saida:**

```
.........................A
........................AB
.......................ABC
......................ABCD
.....................ABCDE
....................ABCDEF
...................ABCDEFG
..................ABCDEFGH
```

### Caso 2

- **Entrada:**

```
26 minusculas
```

- **Saida:**

```
.........................a
........................ab
.......................abc
......................abcd
.....................abcde
....................abcdef
...................abcdefg
..................abcdefgh
.................abcdefghi
................abcdefghij
...............abcdefghijk
..............abcdefghijkl
.............abcdefghijklm
............abcdefghijklmn
...........abcdefghijklmno
..........abcdefghijklmnop
.........abcdefghijklmnopq
........abcdefghijklmnopqr
.......abcdefghijklmnopqrs
......abcdefghijklmnopqrst
.....abcdefghijklmnopqrstu
....abcdefghijklmnopqrstuv
...abcdefghijklmnopqrstuvw
..abcdefghijklmnopqrstuvwx
.abcdefghijklmnopqrstuvwxy
abcdefghijklmnopqrstuvwxyz
```