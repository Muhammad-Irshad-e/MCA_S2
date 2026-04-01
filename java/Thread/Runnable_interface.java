import java.util.*;
class fibonacci implements Runnable {
    int n;
    fibonacci(int limit) {
        n = limit;

    }
    public void run() {
        int a = 0 , b = 1, c;
        for (int i = 1; i <= n; i++) {
            System.out.print("\n"+a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}

class Even implements Runnable {
    int start, end;
    Even(int a, int b) {
        start = a;
        end = b;
    }
    public void run() {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println("\nEven number: " + i);
            }
        }
    }
}

public class Runnable_interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit for Fibonacci series:");
        int n = sc.nextInt();
        Thread t1 = new Thread(new fibonacci(n));
        System.out.println("Enter the start and end range for even numbers:");
        int start = sc.nextInt();
        int end = sc.nextInt();
        Thread t2 = new Thread(new Even(start, end));
        t1.start();
        t2.start();
    }
}
