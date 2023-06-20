#You have to write a function pattern which creates the following pattern upto n number of rows. If the Argument is 0 or a Negative Integer then it should #return "" i.e. empty string.
#Examples:
#pattern(4):
#1234
#234
#34
#4

print("----Jai Ganesh------")
print("----Wan to do real Justic to code  and Try it------")
inputStr=input("Enter the string to be printed : ")
for i in range(0, len(inputStr)):

    # inner loop to handle number of columns
    # values changing acc. to outer loop
    for j in range(0, i + 1):
        # printing stars
        print(inputStr[i], end="")

    # ending line after each row
    print("\r")


print('')