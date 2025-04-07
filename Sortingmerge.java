public class Sortingmerge {
    
    public static void mergeSort(int[] arr, int lb, int ub) {
        if (lb < ub) {
            int mid = (lb + ub) / 2;
            mergeSort(arr, lb, mid);
            mergeSort(arr, mid + 1, ub);
            merge(arr, lb, mid, ub);
        }
    }

    public static void merge(int[] arr, int lb, int mid, int ub) {
        int[] b = new int[arr.length];
        int i = lb;
        int j = mid + 1;
        int k = lb;

        while (i <= mid && j <= ub) {
            if (arr[i] < arr[j]) {
                b[k] = arr[i];
                i++;
            } else {
                b[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            b[k] = arr[i];
            i++;
            k++;
        }

        while (j <= ub) {
            b[k] = arr[j];
            j++;
            k++;
        }

        // Copy sorted elements back to original array
        for ( k = lb; k <= ub; k++) {
            arr[k] = b[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
