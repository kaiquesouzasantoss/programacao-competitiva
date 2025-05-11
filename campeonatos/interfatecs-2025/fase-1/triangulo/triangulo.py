import math 

while True:
    PI = 3.14159265358979323846
    entrada = input().strip()

    if(entrada == "0 0 0"):
        break

    a, b, ang_1 = map(float, entrada.split())
    ang_2 = ang_1 * (PI / 180)
    area = 0.5 * a * b * math.sin(ang_2)

    print(f'{area:.4f}')    