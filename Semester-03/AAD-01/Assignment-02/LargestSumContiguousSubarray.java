/*import java.util.*;
public class q1 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the length of array");
        int n=in.nextInt();
        int ar[]= new int[n];
        for(int i=0;i<n;i++) {
        	ar[i]=in.nextInt();
        }
        int x=ar[0],y=1,z;
        for(int i=1;i<n;i++) {
        	if(ar[i]==(x+1)) {
        		y++;
        	}
        	else {
        		x=ar[i];
        		y=1;
        	}
        }
}
}*/

/*import java.util.*;
public class q2 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=in.nextInt();
        int ar[]= new int[n];
        for(int i=0;i<n;i++) {
        	ar[i]=in.nextInt();
        }
        int x;
        for(int i=0;i<n;i++) {
        	for(int j=i+1;j<n-1;j++) {
        		if(ar[i]>ar[j]) {
        			x=ar[i];
        			ar[i]=ar[j];
        			ar[j]=x;
        		}
        	}
        }
        System.out.println(Arrays.toString(ar));
        int k=0;
        for(int i=0;i<n;i++) {
        	if(ar[k]>=0) {
        		k++;
        		continue;
        	}
        	else {
        		break;
        	}
        }
        for(int i=1;i<=n;i++) {
        	if(ar[k]>i) {
        		System.out.println("Smallest positive missing number = "+i);
        	}
        }
         
	}

}
 */

/*import java.util.*;
public class q4 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        System.out.println("Enter number =");
        int n=in.nextInt();
        int x=1;
        for(int i=1;i<=n;i++) {
        	x=x*i;
        }
        System.out.println("Factorial of the number ="+x);
	}

}
 */

/*import java.util.*;
public class test {

	public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
    int a=0,b=1,c=0;
    System.out.println("Enter the nth fibonaci number");
    int n=in.nextInt();
    if(n>2) {
    System.out.print(a);
    System.out.print(","+b);
    for(int i=0;i<n-2;i++) {
    	c=a+b;
    	System.out.print(","+c);
    	a=b;
    	b=c;
    }
    }
    else if(n==2) {
        System.out.print(a);
        System.out.print(","+b);
    }
    else if(n==1) {
        System.out.print(a);
    }
    }
}*/





import java.util.Scanner;
public class LargestSumContiguousSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        System.out.println("Maximum contiguous sum is " + maxSoFar);
        scanner.close();
    }
}