import java.util.Arrays;

public class RemoveDuplicatesFromArray1 {
    
    // Method to remove duplicates from an array
    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return arr;
        }
        
        int newSize = 1;
        for (int i = 1; i < n; i++) {
            boolean duplicate = false;
            for (int j = 0; j < newSize; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                arr[newSize++] = arr[i];
            }
        }
        
        return Arrays.copyOf(arr, newSize);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4, 5};
        
        // Remove duplicates
        int[] result = removeDuplicates(arr);
        
        // Print the result
        System.out.println("Input : " + Arrays.toString(arr));
        System.out.println("Output: " + Arrays.toString(result));
    }
}
