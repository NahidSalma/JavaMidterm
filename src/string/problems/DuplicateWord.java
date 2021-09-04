package string.problems;

import java.util.*;

public class DuplicateWord {

    public static void main(String[] args) {

        /*
         Write a java program to find the duplicate words and their number of occurrences in the string.
            Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used Language. ";
        getDuplicateWords(st);

    }

    public static void getDuplicateWords(String sentence){
        String  input = sentence.trim().toLowerCase();
        input = input.toLowerCase();
        String[] strArray = input.split("\\s");
        List<String> listOfWords = Arrays.asList(strArray);

        HashSet<String> uniqueWords = new HashSet<>(listOfWords);
        for(String word : uniqueWords)
        {
            if(Collections.frequency(listOfWords,word) > 1)
                System.out.println("The duplicate word \'" + word + "\' found " + Collections.frequency(listOfWords,word) + " times.");
        }

    }












}
