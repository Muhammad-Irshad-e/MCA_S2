public class shapeOverloading {

    public static void main(String[] args)
    {
        shape sh = new shape();

        sh.area(3.00);
        sh.area(2.1);
        sh.area(2, 3);
        sh.area(2.1, 3.2);
    }
    

}
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