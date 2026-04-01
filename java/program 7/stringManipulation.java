import java.util.Scanner;
public class stringManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("Length of the string: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Index of first occurrence of 'a': " + str.indexOf('a'));
        System.out.println("Index of last occurrence of 'a': " + str.lastIndexOf('a'));
        System.out.println("Reversed string: " + new StringBuilder(str).reverse().toString());
        System.out.println("concatenated string with 'Hello': " + str.concat(" Hello"));
        System.out.println("Enter a substring to check:");
        String substring = sc.nextLine();
        if (str.contains(substring)) {
            System.out.println("The string contains the substring.");
        } else {
            System.out.println("The string does not contain the substring.");
        }
    }
}
