import java.util.Scanner;
public class StringSort {
    public static void main(String[] args) {
        String[] arr = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 strings:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted strings:");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
