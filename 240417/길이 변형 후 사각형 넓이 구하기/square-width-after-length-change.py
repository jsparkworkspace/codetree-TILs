arr = input().split()
row = int(arr[0])
col = int(arr[1])

row += 8
col *= 3

print(f"{row}\n{col}\n{row * col}")