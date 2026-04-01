import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String el;
        int ch;
        do
        {
            // menu: add , size , search by index, find index, contains, remove, remove by index, display, clear search , exit
            System.out.println("\n-----MENU-----\n1. Add element\n2. Size of list\n3. Search by index\n4. Find index of element\n5. Check if element exists\n6. Remove element by value\n7. Remove element by index\n8. Display list\n9. Clear search\n0. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print("Enter element to add: ");
                    el = sc.next();
                    list.add(el);
                    System.out.println("Element added successfully.");
                    break;
                case 2:
                    System.out.println("Size of list: " + list.size());
                    break;
                case 3:
                    System.out.print("Enter index to search: ");
                    int index = sc.nextInt();
                    if(index >= 0 && index < list.size()) {
                        System.out.println("Element at index " + index + ": " + list.get(index));
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 4:
                    System.out.print("Enter element to find index: ");
                    el = sc.next();
                    int idx = list.indexOf(el);
                    if(idx != -1) {
                        System.out.println("Index of element '" + el + "': " + idx);
                    } else {
                        System.out.println("Element not found in the list.");
                    }
                    break;
                case 5:
                    System.out.print("Enter element to check existence: ");
                    el = sc.next();
                    boolean exists = list.contains(el);
                    if(exists) {
                        System.out.println("Element '" + el + "' exists in the list.");
                    } else {
                        System.out.println("Element '" + el + "' does not exist in the list.");
                    }
                    break;
                case 6:
                    System.out.print("Enter element to remove by value: ");
                    el = sc.next();
                    boolean removed = list.remove(el);
                    System.out.println("Element '" + el + "' removed successfully.");
                    System.out.println("After removing element '" + el + "': " + list);
                    break;
                case 7:
                    System.out.print("Enter index to remove: ");
                    index = sc.nextInt();
                    list.remove(index);
                    System.out.println("After removing element at index " + index + ": " + list);

                    break;
                case 8:
                    System.out.println("Elements in the list: " + list);
                    break;
                case 9:
                    list.clear();
                    System.out.println("List cleared successfully.");
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
            }
        }while(ch != 0);
        
    }
}