testCase = int(input())
li = []
for i in range(0,testCase):
    start = input().split(None)
    start = list(map(lambda x : int(x) , start ))
    end = input().split(None)
    end = list(map(lambda x : int(x) ,end ))
    count = 0
    for j in range(start[1],end[1]+1):
        s = str(j)
        d = 0
        try:
            while d<len(s):
                if s[d] == s[d+1]:
                    s = s[:d+1]+"0"+s[d+2:]
                    d = d + 1
                else:
                    d = d+1
        except Exception as e:
            pass
        count = count + int(s)
    li.append(count)
for x in li:
    print(x)
