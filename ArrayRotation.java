import java.util.Arrays;

public class ArrayRotation {
    
    // Method to rotate array by d elements
    public static void rotateArray(int[] arr, int d) {
        int n = arr.length;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }
    
    // Method to reverse array from start to end indices
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;

        // Rotate array by d elements
        rotateArray(arr, d);

        // Print the rotated array
        System.out.println("Final Output: " + Arrays.toString(arr));
    }
}
