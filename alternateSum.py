n = 52134
num = [int(x) for x in str(n)]
sum = 0
i = 0
while i<=len(num)-1:
    if i == 0 or i % 2 == 0:
        sum += num[i]
        i += 1
    else:
        sum -= num[i]
        i += 1
print(sum)