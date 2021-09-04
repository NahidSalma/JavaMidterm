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













      /*  String wordGiven = "Human brain is a biological learning machine";
        String[] words=wordGiven.trim().split("\\s");
        List<Integer> list = new ArrayList<>();
        String longestWord = "";


        for(Integer i=0; i<words.length;i++){
            list.add(words[i].length());
        }
        Integer max = Collections.max(list);
        System.out.println(max);



for(Integer i=0; i<words.length; i++){

    if(words[i].length()==max)
        longestWord = words[i];
}



        Map<Integer, String> map = new HashMap<Integer, String>();
            map.put(max,longestWord);



        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());

        }

 *//*       Integer[] num = {2,6,5,7,1,9,4};
        Integer i = Collections.max(Arrays.asList(num));
        System.out.println(i);*//*
    }

    public static int getMaxValue(int[] numbers){
        int maxValue = numbers[0];
        for(int i=1;i < numbers.length;i++){
            if(numbers[i] > maxValue){
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    public static int getMinValue(int[] numbers){
        int minValue = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i] < minValue){
                minValue = numbers[i];
            }
        }
        return minValue;
    }*/


    }

}