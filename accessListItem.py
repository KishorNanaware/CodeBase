print("------Jai Ganesh------")
print("-----Topics from below Example-------")
print("-----1: Taking input from user-------")
print("-----2: Creation list with zero size-------")
print("-----3: Creating dynamic/user input for list size -------")
print("-----4: Insert method form List where we are insert value at specific index -------")

sizeOfList= int(input("---Enter the number for size of list---"));

numberList =[]
for i in range(sizeOfList):
	print("Enter the Number for index : ",i)
	number = int(input());
	numberList.insert(i,number);

print("Entered values from List ",numberList);
print("---Summation of Entered values----")
total=0
for i in range(sizeOfList):
	total = total+numberList[i]


print("Total of List",total);
 

  