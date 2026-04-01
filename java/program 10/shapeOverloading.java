import java.util.*;
class shape{

        void area(float a)
    {
        System.out.println("Area of Square :"+(a*a));
    }

    void area(int l, int b)
    {
        System.out.println("Area of Rectangle :"+(l*b));
    }

    void area(double r)
    {
        System.out.println("Area of Circle :"+(3.14*r*r));
    }

    void area(double l, double b)
    {
        System.out.println("Area of Triangle :"+(0.5*l*b));
    }

}

public class shapeOverloading {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        shape sh = new shape();
        System.out.println("Enter the side of square :");
        sh.area(sc.nextFloat());
        System.out.println("Enter the length and breadth of rectangle :");
        sh.area(sc.nextInt(), sc.nextInt());
        System.out.println("Enter the radius of circle :");
        sh.area(sc.nextDouble());
        System.out.println("Enter the length and breadth of triangle :");
        sh.area(sc.nextDouble(), sc.nextDouble());
        
       
    }
    

}