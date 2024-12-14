import java.util.*;
public class q101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();        
        int[] elements = new int[n];                                                        // Initi the array        
        System.out.println("Enter " + n + " elements (in any order):");
        for (int i = 0; i < n; i++) {
            elements[i] = scanner.nextInt();
        }        
                                                                        
        System.out.println("Sorted array: " + Arrays.toString(elements));     
        System.out.print("Enter the item to search: ");                                   // item to be search
        int item = scanner.nextInt();   
        int result = binarySearch(elements, item);
        if (result != -1) {
            System.out.println("Item found at position: " + (result + 1));
        } else {
            System.out.println("Item not found.");
        }
        scanner.close();
    }
    public static int binarySearch(int[] array, int item) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;            
            if (array[mid] == item) {                                           // check item is present or not 
                return mid;
            }          
            if (array[mid] < item) {                                            // if greater ignore left half
                left = mid + 1;
            } else {
                
                right = mid - 1;                                                // if  smaller ignore right half
            }
        }        
        return -1;                                                              // if Item is not present
    }
}
