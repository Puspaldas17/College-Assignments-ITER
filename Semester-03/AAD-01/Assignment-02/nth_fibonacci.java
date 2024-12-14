import java.util.Scanner;

public class nth_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int a=0,b=1,sum=1;
        for(int i=2;i<=n;i++){
            sum=a+b;
            a=b;
            b=sum;
        }
        System.out.println("The "+n+"th Fibonacci number is: "+sum);
    sc.close();
}}

      