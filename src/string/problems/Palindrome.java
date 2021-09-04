package string.problems;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called a palindrome.
            Example: MOM, DAD, MADAM are palindromes.

            Write a method to check if a given String is a palindrome or not.
         */

        System.out.println(isPalindrome("dad"));
    }


    public static boolean isPalindrome(String testWord) {

        String originalWord = testWord;
        String reverseWord = ""; // Objects of String class

        int length = originalWord.length();

        for (int i = length - 1; i >= 0; i--)
            reverseWord = reverseWord + originalWord.charAt(i);

        if (originalWord.equals(reverseWord)){
//            System.out.println("The string is a palindrome.");
        return true;

    }else {
//            System.out.println("The string isn't a palindrome.");
            return false;
        }

    }



    }

