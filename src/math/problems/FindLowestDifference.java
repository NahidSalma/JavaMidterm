package math.problems;

import java.util.ArrayList;
import java.util.List;

public class FindLowestDifference {

    public static void main(String[] args) {
        /*
         Write a method to return the lowest difference between these two arrays
            HINT: The lowest difference between these arrays is 1
        */

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        findLowestDiffOfTwoIntArrays(array1, array2);

    }


    public static int findLowestDiffOfTwoIntArrays(int[] array1, int[] array2){



        List<Integer> list = new ArrayList<Integer>();

        for(int i: array1){

            for(int j: array2){
                list.add(Math.abs(i-j));
            }

        }

        int min = list.get(0);

        for(int i=1; i<list.size(); i++){

            if(list.get(i)<min)
                min = list.get(i);
        }

        System.out.println("min value is: " + min);
        return min;
    }

}
