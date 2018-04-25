import pymysql
db= pymysql.connect(host="localhost",user="root",  
    password="root",db="tencent", charset="utf8")

cur = db.cursor()

with open (r"D:\scrapy\tencentnext\tencentnext.txt",'r',encoding='utf-8') as f:
    while True:
        try:
            name = f.readline()[:-1].split('\t')[:-1][0]
            type1 = f.readline()[:-1].split('\t')[:-1][1]
            count = f.readline()[:-1].split('\t')[:-1][2]
            place = f.readline()[:-1].split('\t')[:-1][3]
            publish = f.readline()[:-1].split('\t')[:-1][4]
            sql = r"insert tencent values('{}','{}',{},'{}','{}')".format(name,type1,int(count),place,publish)
            print(sql)
            cur.execute(sql)
            
            db.commit()
        except:
            continue
        if not f:
            break