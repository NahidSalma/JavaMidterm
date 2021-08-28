package algorithm;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }




    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        int[] list = array;
        //implement here

        return list;
    }

    public int[] mergeSort(int[] array) {
        int[] list = array;
        //implement here

        return list;
    }

/*    public int[] quickSort(int[] array) {
        int[] list = array;
        //implement here

        return list;
    }*/


    public  int[] quickSort(int[] arr )
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

    public static void swap (int array[], int x, int y)
    {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
















    public int[] heapSort(int[] array) {
        final long startTime = System.currentTimeMillis();


        int temp;

        for (int i = array.length / 2 - 1; i >= 0; i--)                //build the heap
        {
            heapify(array, array.length, i);
        }

        for (int i = array.length - 1; i > 0; i--)                            //extract elements from the heap
        {
            temp = array[0];                                                  //move current root to end (since it is the largest)
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);                                             //recall heapify to rebuild heap for the remaining elements
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
//        this.executionTime = executionTime;

        System.out.println("Sorting execution time: " + executionTime);
        printSortedArray(array);

        return array;
    }


    void heapify(int arr[], int n, int i)
    {
        int MAX = i; // Initialize largest as root
        int left = 2 * i + 1; //index of the left child of ith node = 2*i + 1
        int right = 2 * i + 2; //index of the right child of ith node  = 2*i + 2
        int temp;

        if (left < n && arr[left] > arr[MAX])            //check if the left child of the root is larger than the root
        {
            MAX = left;
        }

        if (right < n && arr[right] > arr[MAX])            //check if the right child of the root is larger than the root or left
        {
            MAX = right;
        }

        if (MAX != i)
        {                                               //repeat the procedure for finding the largest element in the heap
            temp = arr[i];
            arr[i] = arr[MAX];
            arr[MAX] = temp;
            heapify(arr, n, MAX);
        }
    }













    public int[] bucketSort(int[] array) {
        int[] list = array;
        //implement here

        return list;
    }

    public int[] shellSort(int[] array) {
        int[] list = array;
        //implement here

        return list;
    }
}
