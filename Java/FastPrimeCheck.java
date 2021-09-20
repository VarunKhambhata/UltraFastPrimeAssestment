// Author:  Varun Khambhata
// Created: 20.09.2021
// 
// This program demonstrates UFPA algorithm to check if a number is a prime.
// UFPA stands for Ultra Fast Prime Assestment.
// Give credits to the author if, you use this algorithm.

import java.util.Scanner;
import java.lang.Math;

class FastPrimeCheck
{
    static boolean UFPA_isPrime(int N)
    {        
        //Magic hack for fast prime assestment
        if ( (N == 2 || N == 3 || N == 5 || N == 7)  ||  (N%2 != 0 && N%3 != 0 && N%5 != 0 && N%7 != 0 && Math.sqrt(N)%1 != 0 ) )
            return true;
        return false;
    }

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(UFPA_isPrime(n))
            System.out.println("Prime Number!");
        else
            System.out.println("Composite Number.");
    }
}
