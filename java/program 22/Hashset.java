import java.util.*;
public class Hashset {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();
        Scanner sc = new Scanner(System.in);
        String el;
        int ch;
        do
        {
            System.out.print("\n-------------------\n1:Add\n2:Remove\n3:Display\n4:Search\n0:Exit\n--------------------\nEnter your choice : ");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print("Enter element to add: ");
                    el = sc.next();
                    set.add(el);
                    System.out.println("Element added successfully.");
                    break;
                case 2:
                    System.out.print("Enter element to remove: ");
                    el = sc.next();
                    set.remove(el);
                    System.out.println("Element removed successfully.");
                    break;
                case 3:
                    System.out.println("Elements in the set: " + set);
                    break;
                case 4:
                    System.out.print("Enter element to search: ");
                    el = sc.next();
                    boolean exists = set.contains(el);
                    System.out.println("Element '" + el + "' exists in the set: " + exists);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Wrong choice. Please enter a valid option.");
            }
        }while (ch!=0);
    }
}
    
