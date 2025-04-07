public class SortingQuick {
    public static int partition(int[] arr, int lb, int ub) {
        int pivot = arr[lb]; // Choosing the first element as pivot
        int start = lb;
        int end = ub;
        while (start < end) {
            while (start <= ub && arr[start] <= pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                // Swap arr[start] and arr[end]
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        // Swap pivot with arr[end]
        int temp = arr[lb];
        arr[lb] = arr[end];
        arr[end] = temp;
        return end; // Return the index of the pivot
    }

    public static void quickSort(int[] arr, int lb, int ub) {
        if (lb < ub) {
            int loc = partition(arr, lb, ub); // Partitioning the array
            quickSort(arr, lb, loc - 1); // Recursively sort the left subarray
            quickSort(arr, loc + 1, ub); // Recursively sort the right subarray
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
