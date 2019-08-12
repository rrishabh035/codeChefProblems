testCase = int(input())
li = []
for i in range(0,testCase):
    n = int(input())
    # a = [int(x) for x in input().split(None)]
    a = input().split(None)
    a = list(map(lambda x : int(x) , a ))
    a.insert(0,0)
    a.append(0)
    a.append(0)
    count = 0
    count1 =0
    count2 = 0
    j = 1
    while j != n+1:
        k = j+1
        while k != n+1:
            l = k
            while l != n+1 :
                try:
                    for z in range(j,k):
                        count1 = count1^a[z]
                    for z in range(k,l+1):
                        count2 = count2^a[z]
                    if count1 == count2:
                        count = count +1
                    count1 = 0
                    count2 = 0
                except Exception as e:
                    pass
                l = l +1
            k = k+ 1
        j = j+ 1
    del a
    a = None
    li.append(count)
for x in li:
    print(x)
