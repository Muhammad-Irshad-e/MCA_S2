class Person
{
    String name;
    String gender;
    int age;
    String address;
    Person(String name, String gender, int age, String address)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }   
}

class Employee extends Person
{
    int empid;
    String companyName;
    String qualification;
    double salary;
    Employee(String name, String gender, int age, String address, int empid, String companyName, String qualification, double salary)
    {
        super(name, gender, age, address);
        this.empid = empid;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teacher extends Employee
{
    String subject;
    String dept;
    int teacherid;
    Teacher(String name, String gender, int age, String address, int empid, String companyName, String qualification, double salary, String subject, String dept, int teacherid)
    {
        super(name, gender, age, address, empid, companyName, qualification, salary);
        this.subject = subject;
        this.dept = dept;
        this.teacherid = teacherid;
    }
    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);    
        System.out.println("Age: " + age);      
        System.out.println("Address: " + address);
        System.out.println("Employee ID: " + empid);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + dept);
        System.out.println("Teacher ID: " + teacherid);
        System.out.println();

    }
}

public class MultiLevel {
    public static void main(String[] args) {
        Teacher[] t1 = new Teacher[3];
        t1[0] = new Teacher("Ajmal U K", "Male", 30, "Iritti", 1, "TVE", "MCA", 50000, "Data Structures", "Computer Science", 101);
        t1[1] = new Teacher("Amarjith", "Male", 32, "Panoor", 2, "TVE", "MCA", 55000, "Calculus", "Mathematics", 102);
        t1[2] = new Teacher("Rashid K P", "Male", 35, "Payyannur", 3, "TVE", "MCA", 60000, "Quantum Mechanics", "Physics", 103);
        for (Teacher teacher : t1) {
            teacher.display();
        }
    }
}