import java.util.Scanner;
public class sumcotigiussubarray {
    public static int sumcotigiussubarray(int[] A) {
        int max = A[0];
        int maxEnd = A[0];
        for (int i = 1; i < A.length; i++) {
            maxEnd = Math.max(A[i], maxEnd + A[i]);
            max = Math.max(max, maxEnd);
        }       
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] A = new int[n];
        
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }        
        System.out.println("Largest sum contiguous subarray is " + sumcotigiussubarray(A));
        sc.close();
    }
}