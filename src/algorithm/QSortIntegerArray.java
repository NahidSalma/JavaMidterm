package algorithm;

public class QSortIntegerArray {


    static void display(Integer arr[])                 //display the array
    {
        for (int i=0; i<arr.length; ++i)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // This is unsorted array
//   static Integer[] array = new Integer[] { 12, 13, 24, 10, 3, 6, 90, 70 };
    static Integer[] array = new Integer[] { 12, 13, 24, 10, 3, 6, 90, 70 };
    static int[] array2 = new int[] { 40,25,31,17,5,6,9 };


    public static void main(String[] args)
    {

        // Let's sort using quick sort
//        quickSort( array, 0, array.length - 1 );
        quickSort(array);
       display(array);

    }

    public static Integer[] quickSort(Integer[] arr )
    {
        int firstIndex=0;
        int lastIndex = arr.length-1;

        //check for empty or null array
        if (arr == null || arr.length == 0){
            System.out.println("There is not data inside the array to be sorted.");
            return arr;
        }

        if (firstIndex >= lastIndex){
            System.out.println("First index cannot be greater than Last index.");
            return arr;
        }

        //Get the midElement element from the middleIndex of the list
        int middleIndex = firstIndex + (lastIndex - firstIndex) / 2;
        int midElement = arr[middleIndex];

        // make left < midElement and right > midElement
//        int i = firstIndex, j = lastIndex;
        while (firstIndex <= lastIndex)
        {
            //Check until all values on left side array are lower than midElement
            while (arr[firstIndex] < midElement)
            {
                firstIndex++;
            }
            //Check until all values on left side array are greater than midElement
            while (arr[lastIndex] > midElement)
            {
                lastIndex--;
            }
            //Now compare values from both side of lists to see if they need swapping
            //After swapping move the iterator on both lists
            if (firstIndex <= lastIndex)
            {
                swap (arr, firstIndex, lastIndex);
                firstIndex++;
                lastIndex--;
            }
        }
        //Do same operation as above recursively to sort two sub arrays
        if (firstIndex < lastIndex) quickSort(arr);
        if (lastIndex > firstIndex) quickSort(arr);
        return arr;
    }

    public static void swap (Integer array[], int x, int y)
    {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}

