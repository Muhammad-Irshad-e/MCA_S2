class Complex
{
    int real;
    int img;
    Complex(int val){
        real =val;
        img = val;

    }
    Complex(int r,int i){
        real =r;
        img = i;
    }
    void display()
    {
        System.out.println(real+"+"+img+"i");
    }
}

public class CunstructorOverloading {

    public static void main(String[] args) {
        Complex c1 = new Complex(5);
        Complex c2 = new Complex(3, 2);

        c1.display();
        c2.display();
    }
}
