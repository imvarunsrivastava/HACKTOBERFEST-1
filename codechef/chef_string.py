t=int(input())
while (t>=1):
    n= int(input())
    chef=0
    morty=0
   
    while(n>=1):
        a,b = input().split() 
        a=sum(map(int, str(int(a))))
        b=sum(map(int, str(int(b))))
        if a>b:
            chef+=1
        elif b>a:
            morty+=1
        else:
            chef+=1
            morty+=1
        n-=1


     
    if chef==morty:
        L=[2,chef]
        print(*L)
    elif chef>morty:
        L=[0,chef]
        print(*L)
    else:
        L=[1,morty]
        print(*L)
         

    
    
        
    t-=1
