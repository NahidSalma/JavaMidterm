package math.problems;

import parser.ParserUtils;

public class Factorial {

    /*
     Write a method to return the Factorial of any given number using Recursion as well as Iteration

     Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static void main(String[] args) {
        System.out.println(getFactorial(0));

    }

    public static int getFactorial(int num){
        int i,fact=1;
        for(i=1;i<=num;i++){
            fact=fact*i;
        }
return fact;
    }

}
