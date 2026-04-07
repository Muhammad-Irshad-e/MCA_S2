import java.util.*;
public class Queue {
    public static void main(String[] args) {
        PriorityQueue<String> q = new PriorityQueue<String>();
        Scanner sc = new Scanner(System.in);
        String el;
        int ch;
        do
        {
            System.out.println("\n-----MENU-----\n1. Add element\n2. Remove \n3.display\n4.head\n0.wrong choice\n---------------------\n Enter your choice: ");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print("Enter element to add: ");
                    el = sc.next();
                    q.add(el);
                    System.out.println("Element added successfully.");
                    break;
                case 2:
                    q.remove();
                    System.out.println("Element removed successfully.");
                    break;
                case 3:
                    System.out.println("Elements in the queue: " + q);
                    break;
                case 4:
                    System.out.println("Head of the queue: " + q.peek());
                    break;
                default:
                    System.out.println("Wrong choice. Please enter a valid option.");
            }
        }while (ch!=0);
    }
}