// Author:  Varun Khambhata
// Created: 20.09.2021
// 
// This program demonstrates the use of UFPA algorithm to generate list of prime numbers in given range .
// UFPA stands for Ultra Fast Prime Assestment.
// Give credits to the author if, you use this algorithm.

import java.util.Scanner;
import java.lang.Math;

class FastPrimeGenerator
{
    //Generates Primes between given range
    static void UFPA_GeneratePrime(int From, int To)
    {        
        for(int i=From; i<To; i++)
        {
            //Magic hack for ultra fast prime evaluation
            if ( (i == 2 || i == 3 || i == 5 || i == 7)  ||  (i%2 != 0 && i%3 != 0 && i%5 != 0 && i%7 != 0 && Math.sqrt(i)%1 != 0 ) )
                System.out.print(i + " ");
        }
    }

    public static void main(String arg[])
    {        
        UFPA_GeneratePrime(1, 2000);
    }
}
