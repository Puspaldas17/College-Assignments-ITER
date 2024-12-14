import java.util.Scanner;

public class SmallestMissingPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int smallestMissing = findSmallestMissing(arr);
        System.out.println("Smallest missing positive integer is " + smallestMissing);
        sc.close();
    }

    public static int findSmallestMissing(int[] arr) {
        int n = arr.length;
        boolean[] present = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] <= n) {
                present[arr[i]] = true;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }
        return n + 1;
    }
}