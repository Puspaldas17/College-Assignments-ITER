import java.util.Scanner; 
public class q1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();       
        int[] elements = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            elements[i] = scanner.nextInt();
        }      
        System.out.print("Enter the item to search: ");
        int item = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (elements[i] == item) {
                System.out.println("Item found at position: " + (i + 1));
                scanner.close();
                return; 
            }
        }       
        System.out.println("Item not found.");
        scanner.close();
    }
}
