package math.problems;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         If n = 10, then array will have 9 elements in the range from 1 to 10.
            For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).

         Write a method to find the missing number from the array.
         */
        int[] array = new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6};
        findTheMissingNumberOfAnIntegerArray(array);

    }


    public static void findTheMissingNumberOfAnIntegerArray(int[] array){

int n = array.length+1;
int sum = n*(n+1)/2;
int sum2 = array[0];

        for(int i=1; i<array.length; i++){
            sum2 = sum2 + array[i];
        }

        System.out.println("The missing number is: " + (sum - sum2));


    }



}
