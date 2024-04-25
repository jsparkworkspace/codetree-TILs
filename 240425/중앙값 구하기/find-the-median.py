arr = input().split()
a, b, c = int(arr[0]), int(arr[1]), int(arr[2])

if a > b and c > a or a > c and b > a:
    print(a)
elif b > a and c > b or b > c and a > b:
    print(b)
else:
    print(c)