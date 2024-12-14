import java.util.*;
public class GCD_miss_no
{
    public static void main(String[] args) {
        Scanner op=new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        int a=op.nextInt();
        int b=op.nextInt();
        System.out.print("GCD of "+a+" and "+b+" is : "+GCD(a,b));  
    }
    public static int GCD(int x,int y)
    {
        if(y==0)
            return x;
        return GCD(y, x%y);
    }
}
