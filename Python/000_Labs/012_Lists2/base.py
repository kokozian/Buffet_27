x = int(input("How man numbers would u like to create :"))
thislist=[]
import random
for c in range(0,9):
    thislist.append (random.randrange(0,9))
print(thislist)    