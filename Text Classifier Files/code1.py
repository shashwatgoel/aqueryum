import func
import knn
import time
for i in range(1,6):
    file1=open("sms.txt",'r')
    l=[]
    ques=[]
    for i in file1:
        l.append(i.split(" "))
        ##print l
    a=func.rem_useless(l)
    ##print a
    for i in a:
        res=knn.knn(i)
        ques.append(res)
        ##print res
    res1=func.count(ques)
    print res1
    time.sleep(5)
