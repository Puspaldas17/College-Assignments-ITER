import java.util.Scanner;

public class MaxMinRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int max = findMax(array, 0, array[0]);
        int min = findMin(array, 0, array[0]);

        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);
    }

    public static int findMax(int[] array, int index, int maxSoFar) {
        if (index == array.length - 1) { // Check if we've reached the last element
            return Math.max(array[index], maxSoFar);
        } else {
            if (array[index] > maxSoFar) {
                maxSoFar = array[index];
            }
            return findMax(array, index + 1, maxSoFar);
        }
    }

    public static int findMin(int[] array, int index, int minSoFar) {
        if (index == array.length - 1) { // Check if we've reached the last element
            return Math.min(array[index], minSoFar);
        } else {
            if (array[index] < minSoFar) {
                minSoFar = array[index];
            }
            return findMin(array, index + 1, minSoFar);
        }
    }
} 