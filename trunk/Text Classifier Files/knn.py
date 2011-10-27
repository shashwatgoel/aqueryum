import os
def knn(l):
    list=os.listdir("C:\\Users\\shashwat\\Desktop\\Downloads\\Project\\Project\\Categories")
    count=[]
    for i in list:
        stri="C:\\Users\\shashwat\\Desktop\\Downloads\\Project\\Project\\Categories" + i
        file1=open(stri,'r')
        a=0
        for j in file1:
            j=j[:-1]
            ##print j
            for k in l:
                if(k==j):
                    ##print "----------"+k
                    a=a+1
        count.append(a)
    return count
