// Author:  Varun Khambhata
// Created: 20.09.2021
// 
// This program demonstrates the use of UFPA algorithm to generate list of prime numbers in given range .
// UFPA stands for Ultra Fast Prime Assestment.
// Give credits to the author if, you use this algorithm.

#include<iostream>
#include<math.h>

//Generate list of prime numbers between given range
//By default Generator will start from 1
void UFPA_GeneratePrime(int To, int From=1)
{           
    for(int i=From; i<To;i++)
    {
        //prime assestment hack
        if ( (i == 2 || i == 3 || i == 5 || i == 7)  ||  (i%2 != 0 && i%3 != 0 && i%5 != 0 && i%7 != 0 && fmod(sqrt(i),1) != 0 ) ) 
            std::cout<<i<<" ";            
    }
}

int main()
{
    std::cout<<"Enter start & end range for numbers to find prime in it: ";
    int F,T;
    std::cin>> F >> T;
    UFPA_GeneratePrime(T,F);
    return 0;
}
