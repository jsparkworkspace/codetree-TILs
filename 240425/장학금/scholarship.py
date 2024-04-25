arr = input().split()
a = int(arr[0])
b = int(arr[1])

if a >= 90 and b >= 95:
    print(10)
elif a >= 90 and b >= 90:
    print(5)
else:
    print(0)