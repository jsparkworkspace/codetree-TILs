arr = input().split()
arr[0] = int(arr[0])
arr[1] = int(arr[1])
arr[2] = int(arr[2])

print(f"{sum(arr)}\n{sum(arr)//len(arr)}\n{sum(arr) - sum(arr) // len(arr)}")