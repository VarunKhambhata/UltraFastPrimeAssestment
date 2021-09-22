# Ultra Fast Prime Assestment (UFPA)

This algorithm provieds the fastest way to check if a number is prime or generate a list of prime numbers.

This is made using a magic hack of only one line to check prime number.\
This algorithm is made from my theory that if a number can't be divided by 2,3,5,7 than no number in infinity can divide that number.

Time Complexity for this algorithm is:
  - O(1) for checking a number.
  - O(n) for genrating prime numbers upto 'n'
  
The value of a number is not a factor in time complexity here. Every number, small or large takes same amount of time and process.

The largest value it can process depends on the datatype of variables used. Using 'int', the largest acceptable value is 2147483647 and for 'short int', the largest acceptable
value is 32767. 

Since the value is not a factor in time complexity, the calculation will be done in O(1) for even the largest number a 'long long int' can store.

This algorithm is completely accurate upto 100 but going onwards, accuracy starts decreasing linearly; resulting in false positive assestment of number.\
This algorithm is implementd in C/C++, Java and Python program in this repository.
 <br><br>
> I would appericiate any suggestions for improving this algorithm to make it even faster and more accurate.
