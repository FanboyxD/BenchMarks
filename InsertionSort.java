public class InsertionSort {
    /* Function to sort array using insertion sort */
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    /* Function to generate a list of 10^n elements */
    static int[] generateRandomArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 10000000); // You can adjust the range as needed
        }
        return arr;
    }

    // Driver method
    public static void main(String args[]) {
        // Generate a list of 10^5 elements
        int n = (int) Math.pow(10, 3);
        int arr[] = generateRandomArray(n);

        // Record start time
        long startTime = System.currentTimeMillis();

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);

        // Record end time
        long endTime = System.currentTimeMillis();

        System.out.println("Sorted array: ");
        printArray(arr);

        // Calculate and print the time taken
        long totalTime = endTime - startTime;
        System.out.println("Time taken: " + totalTime + " milliseconds");
    }
}
/*This code is contributed by Rajat Mishra */