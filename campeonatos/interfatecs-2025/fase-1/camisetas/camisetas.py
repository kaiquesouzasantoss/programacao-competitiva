T = int(input())
camisetas = [tuple(map(int, input().split(" "))) for _ in range(3)]
dp = [0] * (T + 1)

for Q, L in camisetas:
    for t in range(Q, T+1):
        dp[t] = max(dp[t], dp[t - Q] + L)

print(dp[T])