package algorithm;

import org.testng.Assert;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UnitTestSorting {

    public static void displaySortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }





    /*
      This class is used to help with unit testing of sorting algorithms from the Sort class
     */
    public static void main(String[] args) {
        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};

        // Create instance of Sort class
        Sort sort = new Sort();
       displaySortedArray(sort.quickSort(unSortedArray));


/*        System.out.println("Today's date is : " + LocalDate.now());
        System.out.println("Today's date and time is : " + LocalDateTime.now());*/

















        // Pass the unsorted array to selectionSort() method from Sort class
   /*     sort.selectionSort(unSortedArray);

        // Verify if the unsorted array is sorted by the selectionSort() method
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
        } catch (Exception ex) {
            ex.getMessage();
        }*/




        // Implement Unit test for rest of the sorting algorithms below

//        sort.heapSort(unSortedArray);
//        sort.printSortedArray(sort.heapSort(unSortedArray));

        // Verify if the unsorted array is sorted by the heapSort() method


    /*    try {
            Assert.assertEquals(sortedArray, unSortedArray, "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
        } catch (Exception ex) {
            ex.getMessage();
        }*/

    }
}
