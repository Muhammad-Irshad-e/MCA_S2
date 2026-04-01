import java.util.Scanner;
interface Shape {
    double area();
    double perimeter();
}
class Circle implements Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
class Rectangle implements Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double area() {
        return length * width;
    }
    public double perimeter() {
        return 2 * (length + width);
    }
}
public class myshape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Choose shape: 1. Circle 2. Rectangle");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                Circle circle = new Circle(radius);
                System.out.println("Area of Circle: " + circle.area());
                System.out.println("Perimeter of Circle: " + circle.perimeter());
            } else if (choice == 2) {
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter width: ");
                double width = sc.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);
                System.out.println("Area of Rectangle: " + rectangle.area());
                System.out.println("Perimeter of Rectangle: " + rectangle.perimeter());
            } else {
                System.out.println("Invalid choice!");
            }
            System.out.println("Do you want to continue? (yes/no)");
        }while(sc.next().equalsIgnoreCase("yes"));
    }
}

