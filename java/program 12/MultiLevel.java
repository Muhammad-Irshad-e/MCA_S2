import java.util.*;
class Person {
    Scanner sc = new Scanner(System.in);
    String name, address;
    char gender;
    int age;
    Person(int x)
    {
        System.out.println("Enter the details of person "+x);
        System.out.println("Enter the name :");
        name = sc.next();
        System.out.println("Enter the gender :");
        gender = sc.next().charAt(0);
        System.out.println("Enter the age :");
        age = sc.nextInt();
        System.out.println("Enter the address :");
        address = sc.next();
    }
}

class Employee extends Person {
    Scanner sc = new Scanner(System.in);
    int empid;
    String company_name, qualification;
    float salary;
    Employee(int x)
    {
        super(x);
        System.out.println("Enter the employee id :");
        empid = sc.nextInt();
        System.out.println("Enter the company name :");
        company_name = sc.next();
        System.out.println("Enter the qualification :");
        qualification = sc.next();
        System.out.println("Enter the salary :");
        salary = sc.nextFloat();
    }
}

class Teacher extends Employee {
    Scanner sc = new Scanner(System.in);
    String subject, department;
    int teacherid;
    Teacher(int x)
    {
        super(x);
        System.out.println("Enter the teacher id :");
        teacherid = sc.nextInt();
        System.out.println("Enter the subject :");
        subject = sc.next();
        System.out.println("Enter the department :");
        department = sc.next();
    }

    void display(int n)
    {
        System.out.println("\nDetails of "+n+" teachers");
        System.out.println("Name :"+name);
        System.out.println("Gender :"+gender);
        System.out.println("Age :"+age);
        System.out.println("Address :"+address);
        System.out.println("Employee Id :"+empid);
        System.out.println("Teacher Id :"+teacherid);
        System.out.println("Company Name :"+company_name);
        System.out.println("Department :"+department);
        System.out.println("Qualification :"+qualification);
        System.out.println("Subject :"+subject);
        System.out.println("Salary :"+salary);

    }
}

class MultiLevel {
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of teachers :");
        n = sc.nextInt();
        Teacher[] t = new Teacher[n];
        for(int i=0; i<n; i++)
        {
            t[i] = new Teacher(i+1);
        }
        for(int i=0; i<n; i++)
        {
            t[i].display(i+1);
        }
    }
}