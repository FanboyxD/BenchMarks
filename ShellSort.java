class ShellSort {
    /* An utility function to print array of size n*/
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    /* function to sort arr using shellSort */
    int sort(int arr[]) {
        int n = arr.length;

        // Start with a big gap, then reduce the gap
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already
            // in gapped order keep adding one more element
            // until the entire array is gap sorted
            for (int i = gap; i < n; i += 1) {
                // add a[i] to the elements that have been gap
                // sorted save a[i] in temp and make a hole at
                // position i
                int temp = arr[i];

                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];

                // put temp (the original a[i]) in its correct
                // location
                arr[j] = temp;
            }
        }
        return 0;
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

        System.out.println("Array before sorting");
        printArray(arr);

        // Record start time
        long startTime = System.currentTimeMillis();

        ShellSort ob = new ShellSort();
        ob.sort(arr);

        // Record end time
        long endTime = System.currentTimeMillis();

        System.out.println("Array after sorting");
        printArray(arr);

        // Calculate and print the time taken
        long totalTime = endTime - startTime;
        System.out.println("Time taken: " + totalTime + " milliseconds");
    }
}
/*This code is contributed by Rajat Mishra */