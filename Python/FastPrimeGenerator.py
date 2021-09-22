# Author:  Varun Khambhata
# Created: 20.09.2021
# 
# This program demonstrates UFPA algorithm to check if a number is a prime.
# UFPA stands for Ultra Fast Prime Assestment.
# Give credits to the author if, you use this algorithm.

import math
def UFPA_GeneratePrime(start,end):
    primeNO = list()
    i = start
    while(i<=end):
        if( (i==2 or i==3 or i==5 or i==7) or(i%2 != 0 and i%3 != 0 and i%5 != 0 and i%7 !=0) and math.sqrt(i)%1 !=0 ):
            primeNO.append(i)        
        i = i+1
    return primeNO
    

#main
print("Enter start and end number of a range",end=": ")
S = int(input())
E = int(input())
primes = UFPA_GeneratePrime(S,E)
print(primes)
input()
