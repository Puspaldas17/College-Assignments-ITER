import java.util.Scanner;
public class trail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements greater than 5: ");

        int n = sc.nextInt();
        if (n>5) {
            int[] array = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            int max = array[0];
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
                if (array[i] < min) {
                    min = array[i];
                }
            }
            System.out.println("Maximum value: " + max);
            System.out.println("Minimum value: " + min);
        }
        else {
            System.out.println("Please enter elements greater than 5");
        }

    }
}



/*
import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Q3 solution = new Q3();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements:");

        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the K value:");
        int k = sc.nextInt();

        System.out.println("Original Array: " + Arrays.toString(nums));

        solution.rotate(nums, k);

        System.out.println("Array after rotating by " + k + " steps: " + Arrays.toString(nums));
    }
}*/


/*import java.util.Scanner;
public class A1Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many no you want to enter ");
		int a = sc.nextInt();
		int sum =0;
		for(int i=0 ; i<a;i++) {
			System.out.println("Enter the no");
			int x = sc.nextInt();
			sum = sum+x;
		}
		System.out.println("Sum is:-"+sum);
		
	}

}*/
