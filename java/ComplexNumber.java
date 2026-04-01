import java.util.Scanner;
class ComplexNumber {
    int real;
    int img;
    ComplexNumber(int r, int i) {
        real = r;
        img = i;
    }
    public void display() {
        System.out.println("Complex Number: " + real + " + " + img + "i");
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter real and imaginary parts of first complex number:");
        int r1 = s.nextInt();
        int i1 = s.nextInt();
        ComplexNumber c1 = new ComplexNumber(r1, i1);
        System.out.println("Enter real and imaginary parts of second complex number:");
        int r2 = s.nextInt();
        int i2 = s.nextInt();
        ComplexNumber c2 = new ComplexNumber(r2, i2); 
        System.out.println("First ");
        c1.display();
        System.out.println("Second ");
        c2.display();
        int realSum = c1.real + c2.real;
        int imgSum = c1.img + c2.img;
        ComplexNumber sum = new ComplexNumber(realSum, imgSum);
        System.out.println("Sum of the two complex numbers:");
        sum.display();
    }
}