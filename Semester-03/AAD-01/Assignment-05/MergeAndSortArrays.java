import java.util.Arrays;
import java.util.Scanner;
public class MergeAndSortArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input for the first array
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }
        // Input for the second array
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }
        // Display the input arrays
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        // Merge the arrays
        int[] mergedArray = mergeArrays(array1, array2);
        // Sort the merged array
        Arrays.sort(mergedArray);
        // Display the merged and sorted array
        System.out.println("Merged and Sorted Array: " + Arrays.toString(mergedArray));
        scanner.close();
    }
    public static int[] mergeArrays(int[] array1, int[] array2) {
        int n1 = array1.length;
        int n2 = array2.length;
        int[] mergedArray = new int[n1 + n2];
        // Copy elements from array1
        System.arraycopy(array1, 0, mergedArray, 0, n1);
        // Copy elements from array2
        System.arraycopy(array2, 0, mergedArray, n1, n2);
         return mergedArray;
    }
}
