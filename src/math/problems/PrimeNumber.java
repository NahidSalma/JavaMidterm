package math.problems;

public class PrimeNumber {

    public static void main(String[] args) {
        /*
        Write a method to print the list of prime numbers from 2 to 1,000,000
            Solving the problem should be your first priority, however bonus points if you can figure out how to
            improve algorithmic efficiency

         Print out the prime numbers in the given range.
         */


        printPrimeNumbers(2, 100);
    }



    public static void printPrimeNumbers(int firstNumber, int lastNumber) {

        for (int i = firstNumber; i < lastNumber; i++) {

            if(isPrime(i)){
                System.out.print(i + ",");
            }

        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}