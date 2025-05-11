t, v, c, m = int(input()), int(input()), int(input()), int(input())

print(
    min(
        (c * t + m * t * 2), (v * t + m * t), (v * t * 2 + c * t)
    ) * 2
)