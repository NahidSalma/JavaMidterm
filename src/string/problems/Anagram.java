package string.problems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    /*
    Write a Java Program to check if two Strings are Anagrams.
        Two String are called Anagrams when both Strings use the same characters but in different order.
        Example: "CAT" and "ACT", "ARMY" and "MARY", "FART" and "RAFT"
    */





    public static void main(String[] args) {

//        System.out.println(isAnagrams("Abcd", "Abdc"));
        isUserInputsAreAnagrams();

    }


    public static void isUserInputsAreAnagrams() {
        boolean result = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("This software is testing if two words are anagrams!");
        System.out.println("Please type the first word:");
        String str1 = scanner.nextLine();

        System.out.println("Please type the second word:");
        String str2 = scanner.nextLine();

        if (str1.length() == str2.length()) {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            result = Arrays.equals(charArray1, charArray2);

            if (result == true) {
                System.out.println("the words are anagrams");

            } else {
                System.out.println("the words are not anagrams");
            }
        } else {
            System.out.println("the words are not anagrams");
        }
        scanner.close();
    }














    public static boolean isAnagrams(String word1, String word2) {
        boolean result = false;
        String str1 = word1.toLowerCase();
        String str2 = word2.toLowerCase();

        if (str1.length() == str2.length()) {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            result = Arrays.equals(charArray1, charArray2);

            if (result == true) {
                System.out.println("the inputs are anagrams");

            } else {
                System.out.println("the inputs are not anagrams");
            }
        } else {
            System.out.println("the inputs are not anagrams");
        }
        return result;
    }





}
