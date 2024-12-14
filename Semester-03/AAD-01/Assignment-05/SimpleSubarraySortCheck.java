import java.util.Scanner;

public class SimpleSubarraySortCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        if (canBeSortedByReversingSubarray(array, n)) {
            System.out.println("Yes, reversing a subarray can sort the array.");
        } else {
            System.out.println("No, reversing a subarray cannot sort the array.");
        }
        
        scanner.close();
    }

    public static boolean canBeSortedByReversingSubarray(int[] arr, int n) {
        int start = -1, end = -1;

        // Find the first element which is out of order from the start
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                start = i;
                break;
            }
        }

        // If the array is already sorted
        if (start == -1) {
            return true;
        }

        // Find the first element which is out of order from the end
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                end = i;
                break;
            }
        }

        // Reverse the subarray between start and end
        reverseSubarray(arr, start, end);

        // Check if the whole array is sorted after reversing the subarray
        boolean result = isSorted(arr, n);

        // Reverse back the subarray to restore original array
        reverseSubarray(arr, start, end);

        return result;
    }

    public static void reverseSubarray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static boolean isSorted(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
