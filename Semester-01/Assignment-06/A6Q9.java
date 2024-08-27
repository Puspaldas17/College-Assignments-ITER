import java.util.Scanner;
public class A6Q9 {
public static boolean isValid(String password) 
{
if (password.length()<8) 
 return false; 
 int numCount=0;
 int charCount=0;
 for (int i = 0; i < password.length(); i++) 
 {
 char ch = password.charAt(i);
 if (is_Numeric(ch)) 
 numCount++;
 else if (is_Letter(ch)) 
 charCount++;
 else
 return false;
 }
 return numCount >= 2;
}
public static boolean is_Letter(char ch) {
 ch = Character.toUpperCase(ch);
 return (ch >= 'A' && ch <= 'Z');
 }
 public static boolean is_Numeric(char ch) {
 return (ch >= '0' && ch <= '9');
 }
public static void main(String[] args) {
 try (Scanner ob = new Scanner(System.in)) {
	System.out.print("Please enter a Password: "); 
	 String password = ob.nextLine(); 
	 if (isValid(password)) { 
	 System.out.println("Valid Password"); 
	 } else { 
	 System.out.println("Invalid Password"); 
	 }
} 
 } 
}
