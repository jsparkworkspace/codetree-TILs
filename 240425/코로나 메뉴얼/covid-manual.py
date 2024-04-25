arr1 = input().split()
stat_a = arr1[0]
temp_a = int(arr1[1])

arr2 = input().split()
stat_b = arr2[0]
temp_b = int(arr2[1])

arr3 = input().split()
stat_c = arr3[0]
temp_c = int(arr3[1])

if (stat_a == "Y" and temp_a >= 37) and (stat_b == "Y" and temp_b >= 37):
    print("E")
elif (stat_a == "Y" and temp_a >= 37) and (stat_c == "Y" and temp_c >= 37):
    print("E")
elif (stat_c == "Y" and temp_c >= 37) and (stat_b == "Y" and temp_b >= 37):
    print("E")
else:
    print("N")