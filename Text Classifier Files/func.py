def rem_useless(l):
    f1 = open('nouse.txt','r')
    useless = []
    for x in f1:
        useless.append(x[:-1])
    f1.close()
    for j in useless:
        for i in l:
            for k in i:
                c=k.lower()
                if(c == j):
                    i.remove(k)
                elif(c=='\n'):
                    i.remove(k)
    return l

def freq(l):
    dict = {}
    for i in l:
        #i = i.lower()
        if(i not in dict):
            dict[i] = 1
        else:
            dict[i] += 1
    #dict = list(dict)
    print '-------------------------'
    print dict
    print '*************************'
    return dict

def count(l):
    co=[]
    for j in range(0,len(l[0])):
        a=0
        for i in range(0,len(l)):
            a=a+l[i][j]
        co.append(a)
    return co
