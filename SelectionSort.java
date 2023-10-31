import java.io.*;

public class SelectionSort {
    void sort(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Prints the array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        SelectionSort ob = new SelectionSort();

        // Generate a list of 10^5 elements
        int n = (int) Math.pow(10, 3);
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 10000000); // You can adjust the range as needed
        }

        // Record start time
        long startTime = System.currentTimeMillis();

        ob.sort(arr);

        // Record end time
        long endTime = System.currentTimeMillis();

        System.out.println("Sorted array");
        ob.printArray(arr);

        // Calculate and print the time taken
        long totalTime = endTime - startTime;
        System.out.println("Time taken: " + totalTime + " milliseconds");
    }
}
/*This code is contributed by Rajat Mishra */
