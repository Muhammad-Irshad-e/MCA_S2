class CPU {
    double price;

    CPU(double price)
    {
        this.price = price;
    }
    class Processor
    {
        int noOfCores;
        String manufacturer;
        Processor(int noOfCores, String manufacturer)
        {
            this.noOfCores = noOfCores;
            this.manufacturer = manufacturer;
        }
        public void displayProcessor()
        {
            System.out.println("Processor Cores : "+noOfCores);
            System.out.println("Processor Manufacturer : "+manufacturer);
        }
    }
    static class RAM
    {
        int memory;
        String manufacturer;
        RAM(int memory, String manufacturer)
        {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }
        public void displayRam()
        {
            System.out.println("RAM Memory : "+memory+" GB");
            System.out.println("RAM Manufacturer : "+manufacturer);
        }
    }
}


public class NestedInfo {
    
    public static void main(String[] args) {
        CPU cpu = new CPU(40000);

        System.out.println("CPU Prize :" + cpu.price);

        CPU.Processor p = cpu.new Processor(8 , "INTEL");
        CPU.RAM r = new CPU.RAM(16, "Corsair");

        p.displayProcessor();
        r.displayRam();
    }
}
