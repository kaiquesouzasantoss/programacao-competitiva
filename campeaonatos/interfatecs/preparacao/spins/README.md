# Experimento com Spins

## Enunciado

Um cientista chamado Doc. Hugo Strange fez diversos experimentos com spins, elementos capazes de trocar
o status de quantum gates quando passam por eles. Os quantum gates podem assumir os estados OPEN e/ou
CLOSED. Nos experimentos, Doc. Hugo Strange percebeu que toda a vez que um spin é criado um quantum
gate também é criado, e tal spin é responsável por alterar o seu estado. Entretanto, Doc. Hugo está com
dificuldade em determinar quais quantum gates estarão abertos após a criação de N quantum gates, uma
vez que ele percebeu que os spins só trocam o estado de quantum gates múltiplos da ordem em que foram
criados. Por exemplo, o 3o. spin criado alterará o estado dos quantum gates 3, 6, 9, e assim por diante.
Considerando que, a cada experimento, N spins são criados e, consequentemente, N quantum gates serão
criados com estado inicial CLOSED, Doc. Hugo Strange deseja saber quais ficarão abertos após a liberação
dos spins, sendo que não é possível saber a ordem de liberação dos mesmos.

## Entrada

A entrada contém vários casos de teste, onde cada caso tem um número inteiro N (0 < N < 45 × 106)
indicando a quantidade de spins e quantum gates. O fim da entrada é dada por N = 0.

## Saida

Para cada caso de teste, deve-se produzir uma linha de saída indicando quais quantum gates, em ordem
crescente, estarão abertos após a liberação dos spins. Você deve separar a sequência de quantum gates por
um espaço em branco.

## Casos de Teste

### Caso 1

- **Entrada:**

```
2
3
4
0
```

- **Saida:**

```
1
1
1 4
```

### Caso 2

- **Entrada:**

```

```

- **Saida:**

```

```