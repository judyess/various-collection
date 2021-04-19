#Judy Soukkhaphon
#10/27/13
#Ch 9 ex 10 pg 370 MOST FREQUENT CHARACTER


#Main Function
def main():

    #Set up local variables
    count = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
    letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    index = 0
    frequent = 0

    #Receive user input
    user_string = input("Enter a string: ")
    for ch in user_string: #for each individual character in user_string
        ch = ch.upper()#any letter that is not uppercase will become uppercase, uppercase letters and non-alphabet characters will be unchanged
        index=letters.find(ch) #each character has an index that specifies its position in the string
        if index>=0:
            #increase counting array for this letter
            count[index] = count[index] + 1
    for i in range(len(count)):#len function gets length of a string, i is any character
        if count[i] > count[frequent]:
            frequent = i
            
#print results
    print("The character that appears most frequent in the string is", letters[frequent])
    print('length of string', len(user_string))

#Calling the main function
main()
