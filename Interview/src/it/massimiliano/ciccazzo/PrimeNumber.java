package it.massimiliano.ciccazzo;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String args[]) {
      
//     //get input till which prime number to be printed
//      System.out.println("Enter the number till which prime number to be printed: ");
//      int limit = new Scanner(System.in).nextInt();
//    
//      //printing primer numbers till the limit ( 1 to 100)
//      System.out.println("Printing prime number from 1 to " + limit);
//      for(int number = 2; number<=limit; number++){
//          //print prime numbers only
//          if(isPrime(number)){
//              System.out.println(number);
//          }
//      }
    	System.out.println(getNumberOfPrimes(100));

    }

    /*
     * Prime number is not divisible by any number other than 1 and itself
     * @return true if number is prime
     */
    public static boolean isPrime(int number){
        for(int i=2; i<number; i++){
           if(number%i == 0){
               return false; //number is divisible so its not prime
           }
        }
        return true; //number is prime now
    }
    
    static int getNumberOfPrimes(int N) {
        if (N%2==0) return -1;
        //if not, then just check the odds
        for(int i=3;i*i<=N;i+=2) {
            if(N%i==0)
                return i;
        }
        return N;
    }

}
