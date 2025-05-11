dicionarioValores = [
    "*",
    ".",
    "..",
    "...",
    "....",
    "-",
    "-.",
    "-..",
    "-...",
    "-....",
    "--",
    "--.",
    "--..",
    "--...",
    "--....",
    "---",
    "---.",
    "---..",
    "---...",
    "---...."
]

while True:
    entrada = input()

    if(len(entrada.split(" ")) == 1):
        valores = entrada.split(".")
        for i in range(len(valores)):
            valores[i] = valores[i] + "."

        valores.pop()
    else:
        valores = entrada.split(" ")

    if(entrada[0] == "*"):
        break

    saida = list()

    for simbolo in valores:
        for i in range(len(dicionarioValores)):
            if(simbolo == dicionarioValores[i]):
                saida.append(i)

    expoente = len(saida) - 1

    for i in range(len(saida)):
        saida[i] = saida[i] * (20 ** expoente)
        expoente -= 1

    print(sum(saida))

#-.-.-.-.-.-.-.-. zera
#-.-.-.-.-.-.-.-. zera
#-. -. -. -. -. -. -. -.