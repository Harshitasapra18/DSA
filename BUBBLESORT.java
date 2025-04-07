public class BUBBLESORT {
    // Bubble Sort Algorithm
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {  // Runs n-1 times
            for (int j = 0; j < arr.length - i - 1; j++) { // Swaps adjacent elements
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 6, 4, 7, 8};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
