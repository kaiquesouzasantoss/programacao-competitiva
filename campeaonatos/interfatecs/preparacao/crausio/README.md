# Crausio

## Enunciado

Nos últimos anos, o uso de robôs limpadores tem aumentado nas residências brasileiras. Munarinho, um estudante de engenharia, aderiu recentemente a essa onda, mas, para economizar, decidiu criar o seu próprio robô: o Cráusio. Como a grana para o projeto estava curta, ele criou um robô para o qual o usuário tem que configurar manualmente a rotina de movimentos. Para essa configuração, o local de limpeza é representado por uma matriz de L × C células. Cada célula representa um lugar onde Cráusio pode estar. A configuração inicial do Cráusio inclui a célula de partida (X, Y ) e uma sequência de comandos: cima (C), baixo (B), esquerda (E) e direita (D). No entanto, logo na primeira limpeza, Munarinho percebeu que subdimensionou a bateria de Cráusio e ele não consegue seguir muitos dos comandos especificados na sua rotina. Se Cráusio tem B de bateria, consegue executar B comandos. Outra coisa que Munarinho percebeu é que Cráusio não é muito resistente e, quando ele dá comandos errados e o Cráusio fica batendo nas paredes da casa, sua pintura se desgasta facilmente. Ajude Munarinho a determinar qual é a última posição que Cráusio consegue alcançar em um dia, dada sua rotina, posição e bateria inicial. Ainda, determine quantas vezes Cráusio bateu nas paredes da casa, representadas pelos limites da matriz.

## Entrada

A primeira linha contém três inteiros L, C e B (1 ≤ L,C ≤ 100; 0 ≤ B ≤ 10000), representando o número de linhas e colunas da casa de Munarinho e a carga inicial de bateria do Cráusio, respectivamente.

A segunda linha contém dois inteiros X e Y (1 ≤ X ≤ L; 1 ≤ Y ≤ C), representando a posição inicial do Cráusio na casa, sendo (1, 1) o canto superior esquerdo.

A terceira linha contém uma string com R caracteres I (1 ≤ R ≤ 10000; I ∈ {C,B,E,D}), representando a rotina diária de Cráusio.

## Saida

Imprima três inteiros, representando a última posição que o Cráusio conseguirá alcançar (sendo 1,1 o canto superior esquerdo) e a quantidade de vezes que ele bateu nas paredes da casa.

## Casos de Teste

### Caso 1

- **Entrada:**

```
5 5 10
3 3
CDCBEDBECB
```

- **Saida:**

```
3 3 0
```