package string.problems;

import java.util.*;

public class UnitTestingStringProblem {

    public static void main(String[] args) {
        // Unit testing for all classes within this package should be implemented here

   String testingWords = "I am from Bangladesh";

        Map<Integer, String> wordNLength =null;
        wordNLength = DetermineLargestWord.findTheLargestWord(testingWords);


        for(Map.Entry m : wordNLength.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());

        }
















    }

}