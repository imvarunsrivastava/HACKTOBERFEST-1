t=int(input())

while(t>=1):
    n,k = input().split()

    n=int(n)
    k=int(k)
    d =list(map(int, input().strip().split()))[:int(n)]
    anw=[]
   
    for i in range(len(d)):
        if d[i]%k==0:
            anw.append(1)
        else:
            anw.append(0)
   
    print(''.join(str(i) for i in anw))
        
    
    
    t-=1
