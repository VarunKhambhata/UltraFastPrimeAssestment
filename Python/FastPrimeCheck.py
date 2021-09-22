# Author:  Varun Khambhata
# Created: 20.09.2021
# 
# This program demonstrates UFPA algorithm to check if a number is a prime.
# UFPA stands for Ultra Fast Prime Assestment.
# Give credits to the author if, you use this algorithm.

import math
def UFPA_isPrime(n):
    if( (n==2 or n==3 or n==5 or n==7) or(n%2 != 0 and n%3 != 0 and n%5 != 0 and n%7 !=0) and math.sqrt(n)%1 !=0 ):
        return True
    return False

#main
print("Enter a number",end=": ")
N = int(input())
if(UFPA_isPrime(N)):
    print("Prime!")
else:
    print("Composite.")
    
input()
