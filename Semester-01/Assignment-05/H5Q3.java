import java.util.*;
public class H5Q3
{
public static void main(String[] args)
{
Scanner obj = new Scanner (System.in);
double sum=0.0d;
System.out.println("Enter the value of x: ");
int x=obj.nextInt();
System.out.println("Enter a number of terms: ");
int n=obj.nextInt();
int p = 1;
double r = Math.toRadians(x);
for(int i = 1;i<=n;i++)
{
int f = 1;
for(int j=p;j>=1;j--)
{
f *=j;
}
double power = Math.pow(r, p);
if(i%2==0)
{
sum = sum - power/f;
}
else
{
sum = sum + power/f;
}
p +=2;
}
System.out.println("sin ("+x+") = "+sum);
obj.close();
}
}