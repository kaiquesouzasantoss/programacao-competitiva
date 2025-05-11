n = int(input())
suprimentos = 0
min_suprimentos = 0

for i in range(n):
    entrada = int(input())
    suprimentos += entrada
    min_suprimentos = min(min_suprimentos, suprimentos)

print(-min_suprimentos)