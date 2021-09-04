package string.problems;

import java.util.Locale;

public class DeleteClass {

    public static void main(String[] args) {
        String s = "I am from Bangladesh";
       char[] c = s.toLowerCase().toCharArray();
        System.out.println(c.length);

        for(int i=0; i<c.length; i++){

            System.out.print(c[i] + "\n");
        }


    }
}
