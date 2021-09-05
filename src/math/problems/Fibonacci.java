package math.problems;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    /*
    Write a method that will print or return at least 40 Fibonacci numbers

      0,1,1,2,3,5,8,13
     */
    static int n1=0, n2=1, n3=0;

    public static void main(String[] args) {
//        printFibonacci(40);

        getFibonacciList(40);

    }

    public static List<Integer> getFibonacciList(Integer count) {
        List<Integer> list = new ArrayList<Integer>();
        int n1=0, n2=1, n3;
        list.add(n1);
        list.add(n2);
        for(int i=2; i<count; i++){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            list.add(n3);

        }
        System.out.println();
        System.out.println(list.size());
        System.out.println(list);

        return list;
    }

















    static void printFibonacci(int count){
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(int i=2; i<count; i++){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
        }

    }

}
