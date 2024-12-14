import java.util.Scanner;
public class sum_of_n_nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = sc.nextInt();
            sum += num;
        }
        System.out.println("The sum of the " + n + " numbers is: " + sum);
        sc.close();
    }
}