arr1 = input().split()
arr2 = input().split()

math1 = int(arr1[0])
eng1 = int(arr1[1])
math2 = int(arr2[0])
eng2 = int(arr2[1])

if math1 > math2:
    print("A")
elif math2 > math1:
    print("B")
elif eng1 > eng2:
    print("A")
else:
    print("B")