import java.util.Arrays;
import java.util.Scanner;
public class ArrayReduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get the array size from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        // Initialize the array
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(array));
        //Perform reductions and count them
        int reductions = performReductions(array);
        // Display the total number of reductions
        System.out.println("Total number of reductions: " + reductions);
        scanner.close();
    }
    public static int performReductions(int[] array) {
        int reductions = 0;
        while (array.length > 0) {
            // Remove the largest element
            array = reduceArray(array);
            reductions++;
        }
        return reductions;
    }
    public static int[] reduceArray(int[] array) {
        // Find the largest element
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        // Create a new array without the largest element
        int[] reducedArray = new int[array.length - 1];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != maxIndex) {
                reducedArray[index++] = array[i];
            }
        }
        // Display the reduced array
        System.out.println("Reduced Array: " + Arrays.toString(reducedArray));
        return reducedArray;
    }
}
