import java.io.*;

class BubbleSort {

    // An optimized version of Bubble Sort
    static void bubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (!swapped)
                break;
        }
    }

    // Function to print an array
    static void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Function to generate a list of 10^n elements
    static int[] generateRandomArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 10000000); // You can adjust the range as needed
        }
        return arr;
    }

    public static void main(String args[]) {
        // Generate a list of 10^5 elements
        int n = (int) Math.pow(10, 3);
        int arr[] = generateRandomArray(n);

        // Record start time
        long startTime = System.currentTimeMillis();

        bubbleSort(arr, n);

        // Record end time
        long endTime = System.currentTimeMillis();

        System.out.println("Sorted array: ");
        printArray(arr, n);

        // Calculate and print the time taken
        long totalTime = endTime - startTime;
        System.out.println("Time taken: " + totalTime + " milliseconds");
    }
}
// This code is contributed
// by Nikita Tiwari.
