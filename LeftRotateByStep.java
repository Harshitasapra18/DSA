import java.util.Arrays;

public class LeftRotateByStep {
    public static void leftrotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n; 

        reverse(arr, 0, d - 1);   // Reverse first 'd' elements
        reverse(arr, d, n - 1);   // Reverse remaining elements
        reverse(arr, 0, n - 1);   // Reverse entire array
    }

    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        leftrotate(arr, 2);
        

        System.out.println(Arrays.toString(arr)); // Output: [3, 4, 5, 1, 2]
    }
}
