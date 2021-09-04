package string.problems;

import java.util.*;

public class DetermineLargestWord {

    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below
         Should return "10 biological"
         */
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
    }


    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String longestWord = "";

        // Implement here

        String[] words=wordGiven.split("\\s");
        List<Integer> list = new ArrayList<>();


        for(Integer i=0; i<words.length;i++){
            list.add(words[i].length());
        }
        Integer max = Collections.max(list);



        for(Integer i=0; i<words.length; i++){

            if(words[i].length()==max)
                longestWord = words[i];
        }


        map.put(max,longestWord);


        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());

        }

        return map;
    }
}
