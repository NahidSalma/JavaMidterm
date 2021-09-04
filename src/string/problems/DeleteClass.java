package string.problems;

import java.util.*;

public class DeleteClass {

    public static void main(String args[]) {
        // Given Input String containing duplicate words
        String input = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        getDuplicateWords(input);


      /*  // Converting given Input String to lowerCase
        input = input.toLowerCase();
      *//* Split the given Input String into words using
      built-in split() method *//*
        String[] strArray = input.split(" ");
        // Converting String array to List of String
        List<String> listOfWords = Arrays.asList(strArray);
      *//* Declare HashSet of String that will
      contain unique words *//*
        HashSet<String> uniqueWords = new HashSet<>(listOfWords);
        for(String word : uniqueWords)
        {
            if(Collections.frequency(listOfWords,word) > 1)
                System.out.println("The duplicate word \'" + word + "\' found " + Collections.frequency(listOfWords,word) + " times.");
        }*/
    }

    public static void getDuplicateWords(String sentence){
      String  input = sentence.toLowerCase();
        input = input.toLowerCase();
        String[] strArray = input.split(" ");
        List<String> listOfWords = Arrays.asList(strArray);

        HashSet<String> uniqueWords = new HashSet<>(listOfWords);
        for(String word : uniqueWords)
        {
            if(Collections.frequency(listOfWords,word) > 1)
                System.out.println("The duplicate word \'" + word + "\' found " + Collections.frequency(listOfWords,word) + " times.");
        }

    }
}
