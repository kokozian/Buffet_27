import requests

#
# Jokes with 1 part just have a joke
# joke["joke"] -> References the String of the joke itself

x = int(input("How many jokes do u want 1 part : "))
s = int(input("How many jokes do u want 2 part : "))

for y in range(0,x):
    joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=single").json()
    print(joke["joke"]) 
print("these are one part")
for z in range (0,s):
    joke2Part = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=twopart").json()
    print(joke2Part["setup"])
    print(joke2Part["delivery"])

       





# Jokes with 2 parts have a set up and delivery
# joke["setup"] -> References the String of the setup of the joke
# joke["delivery"] -> References the String of the delivery part of the joke

