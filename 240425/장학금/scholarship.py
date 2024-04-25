arr = input().split()
a = int(arr[0])
b = int(arr[1])

if a >= 90 and b >= 95:
    print(1000000)
elif a >= 90 and b >= 90:
    print(500000)
else:
    print(0)