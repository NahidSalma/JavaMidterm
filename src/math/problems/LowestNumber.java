package math.problems;

import java.util.ArrayList;
import java.util.List;

import databases.ConnectToSqlDB;

public class LowestNumber {

    public static void main(String[] args) {
        /*
         Write a method to find the lowest number from this array.
         */

        int[] array = new int[] {211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
        lowestNumberOfAnIntArray(array);
    }

    public static void lowestNumberOfAnIntArray(int[] arr){


        int min = arr[0];

        for(int i=1; i<arr.length; i++){

            if(arr[i]<min)
                min = arr[i];
        }

        System.out.println("Lower number is: " + min);


    }

}
