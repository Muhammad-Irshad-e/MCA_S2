import java.util.*;
class Negative extends RuntimeException {
    Negative(String message) {
        super(message);
    }
}

public class Average {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        double sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            try{
                if(arr[i] < 0)
                {
                    throw new Negative("Negative numbers are not allowed");
                }
                else
                  sum += arr[i];
            }
            catch (Negative e) {
                System.out.println("\n"+e.getMessage());
                System.exit(0);
            }
            
        }
        System.out.println("Average: " +String.format("%.2f", sum/n));
    }
}
