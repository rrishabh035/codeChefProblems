testCase = int(input())
r = []
def fname(a,b,c):
    if b!=0:
        if a - c[b] > 0:
            res[a - c[b]]=res[a - c[b]] + 1
        if a + c[b] <= n:
            res[a + c[b]]= res[a + c[b]] + 1
        fname(a,b-1,c)
    else:
        return 0
for i in range(0,testCase):

    n = int(input())
    c,h,res = [0],[0],[""]
    c.extend([int(x) for x in input().split()] )
    h.extend([int(x) for x in input().split()] )
    for j in range(1,n+1):
        res.append(0)
    for a in range(1,n+1):
        b = a
        fname(a,b,c)
        # for b in range(1,a+1):
        #     if a - c[b] > 0:
        #         res[a - c[b]]=res[a - c[b]] + 1
        #     if a + c[b] <= n:
        #         res[a + c[b]]= res[a + c[b]] + 1
        res[a]=res[a] + 1
    for j in range(1,n+1):
        if res[j] in h:
            h[h.index(res[j])]=0
    del h[0]
    flag = 1
    if any(h):
        r.append("NO")
    else:
        r.append("YES")

for x in r:
    print(str(x),end = "\n")
