class QuickSort {
    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    void sort(int arr[], int low, int high) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is
              now at the right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
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

    // Driver program
    public static void main(String args[]) {
        // Generate a list of 10^5 elements
        int n = (int) Math.pow(10, 3);
        int arr[] = generateRandomArray(n);

        QuickSort ob = new QuickSort();

        System.out.println("Given array is");
        printArray(arr);

        // Record start time
        long startTime = System.currentTimeMillis();

        ob.sort(arr, 0, n - 1);

        // Record end time
        long endTime = System.currentTimeMillis();

        System.out.println("\nSorted array is");
        printArray(arr);

        // Calculate and print the time taken
        long totalTime = endTime - startTime;
        System.out.println("Time taken: " + totalTime + " milliseconds");
    }
}
/*This code is contributed by Rajat Mishra */