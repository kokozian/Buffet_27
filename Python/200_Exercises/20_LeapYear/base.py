y = int(input("Please enter a year to check for a leap year : "))
if y%4 == 0 and y%400 <=99:
    print("That is a leap year")
else:
    print("That is not a leap year")    