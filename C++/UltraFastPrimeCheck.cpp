// Author:  Varun Khambhata
// Created: 20.09.2021
// 
// This program demonstrates UFPA algorithm to check if a number is a prime.
// UFPA stands for Ultra Fast Prime Assestment.
// Give credits to the author if, you use this algorithm.

#include<stdio.h>
#include<math.h>

bool UFPA_isPrime(int N)
{    
    //Magic hack for fast prime assestment
    if ( (N == 2 || N == 3 || N == 5 || N == 7)  ||  (N%2 != 0 && N%3 != 0 && N%5 != 0 && N%7 != 0 && fmod(sqrt(N),1) != 0 ) )
        return true;
    return false;
}

int main()
{
    int n;
    printf("Enter number: ");
    scanf("%d", &n);

    if(UFPA_isPrime(n))
        printf("Prime Number! \n");
    else
        printf("Composite number. \n");
    return 0;
}
