package string.problems;

import java.util.HashSet;
import java.util.Set;

public class Permutation {

    public static void main(String[] args) {

        /*
        Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".

        Write Java program to compute all permutations of any given String
         */



        for (String s: getPermutation("abcd")){
            System.out.println(s);
        }

    }


    public static Set<String> getPermutation(String str) {

        // create a set to avoid duplicate permutation
        Set<String> permutations = new HashSet<String>();

        // check if string is null
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            // terminating condition for recursion
            permutations.add("");
            return permutations;
        }

        // get the first character
        char first = str.charAt(0);

        // get the remaining substring
        String sub = str.substring(1);

        // make recursive call to getPermutation()
        Set<String> words = getPermutation(sub);

        // access each element from words
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){

                // insert the permutation to the set
                permutations.add(strNew.substring(0, i) + first + strNew.substring(i));
            }
        }
        return permutations;
    }

}
