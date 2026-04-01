class Product
{
    String name;
    int code;
    float price;

    Product(String name, int code, float price)
    {
        this.name = name;
        this.code = code;
        this.price = price;
    }
}


class Sample
{
    public static void main(String args[])
    {
        
        Product hp = new Product("HP", 1234, 40000);
        Product dell = new Product("DELL", 2345, 45000);
        Product asus = new Product("ASUS", 3456, 50000);

        Product p = hp;

        if(dell.price < p.price)
        {
            p = dell;
        }
        if(asus.price < p.price)
        {
            p = asus;
        }
        
        System.out.println("Lowest Price Product = "+p.name);
        System.out.println("Product Code = "+p.code);
        System.out.println("Product Price = "+p.price);

    }
}