/**
This program demonstrates the QuickSort algorithm
*/

public class QuickSortDemo
{
    public static void main(String[] args)
    {
        int[] array = { 7, 3, 9, 2, 0, 1, 8, 4, 6, 5};
      

        // Display the array as it is now
        System.out.println("Before the sort:");
        for (int i = 0; i < 10; i ++)
            System.out.print(array[i] + " ");
        System.out.println();

        // Sort the array
        quickSort(array, 0, array.length-1 );

        // Display the array again
        System.out.println("After the sort:");
        for (int i = 0; i < 10; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    /**
        The quickSort method uses the QuickSort algorithm to
        sort array, from array[start] through array[end]
    */

    public static void quickSort(int array[], int start, int end)
    {
        int pivotPoint;

        if (start < end)
        {
            // Get the pivot point
            pivotPoint = partition(array, start, end);

            // Sort the first sub list
            quickSort(array, start, pivotPoint -1);

            // Sort the 2nd sub list
            quickSort(array, pivotPoint + 1, end);
        }
    }

    /** 
        The partition method selects the value in the middle of
        the array as the pivot. The list is rearranged so all
        the values less than the pivot are on its left and all the values
        greater than pivot are on its right
    */

    private static int partition(int array[], int start, int end)
    {
        int pivotValue, pivotIndex, mid;

        mid = (start + end) / 2;

        swap(array, start, mid);
        pivotIndex = start;
        pivotValue = array[start];
        for (int scan = start + 1; scan <= end; scan++)
        {
            if (array[scan] < pivotValue)
            {
                pivotIndex++;
                swap(array, pivotIndex, scan);
            }
        }
        swap(array, start, pivotIndex);

        return pivotIndex;
    }

    /**
        The swap method swaps the element at array[a] with the
        element at array[b]
    */

    private static void swap(int[] array, int a, int b)
    {
        int temp;

        temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
