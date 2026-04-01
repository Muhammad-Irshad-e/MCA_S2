import java.util.Scanner;

class multiple3 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("3 x " + i + " = " + (3 * i));
        }
    }
}

class prime extends Thread {
    int n;

    prime(int limit) {
        this.n = limit;
    }

    int isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }
    public void run() {
        for (int i = 1; i <= n; i++) {
            if (isPrime(i) == 1) {
                System.out.println("Prime number: " + i);
            }
        }
    }
}

public class ThreadFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        multiple3 t1 = new multiple3();
        System.out.println("Enter the limit for prime numbers:");
        int n = sc.nextInt();
        prime t2 = new prime(n);
        t1.start();
        t2.start();
    }
}
