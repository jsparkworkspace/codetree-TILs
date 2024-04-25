arr1 = input().split()
age_a = int(arr1[0])
gender_a = arr1[1]

arr2 = input().split()
age_b = int(arr2[0])
gender_b = arr2[1]

if (age_a >= 19 and gender_a == "M") or (age_b >= 19 and gender_b == "M"):
    print(1)
else:
    print(0)