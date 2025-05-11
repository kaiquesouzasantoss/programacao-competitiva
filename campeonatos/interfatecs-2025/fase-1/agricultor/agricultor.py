n = int(input())
saida = list()

for i in range(n):
    temp, umidade, chuva = map(float, list(input().split(" ")))
    
    if(chuva == 1.0):
        saida.append("NAO REGAR")
    elif(chuva == 0.0):
        if((temp > 30.0 and umidade < 50.0)):
            saida.append("REGAR")
        else:
            saida.append("NAO REGAR")

for item in saida:
    print(item)