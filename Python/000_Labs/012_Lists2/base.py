x = input("Do you want your line vertical or horizantal : ")
y = int(input("How long do you want your line : "))

if x == "horizantal": 
    for z in range(0,y):
        print("-", end="" )
elif x == "vertical":
    for h in range (0,y):
        print("|")
    

