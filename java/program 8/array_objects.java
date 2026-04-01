import java.util.*;
class Employee {
    Scanner sc = new Scanner(System.in);
    int id;
    String name;
    double salary;
    Employee(int n) {
        System.out.println("Enter details of employee " + n);
        System.out.print("ID: ");
        id = sc.nextInt();
        sc.nextLine(); // consume the newline character
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Salary: ");
        salary = sc.nextDouble();
    }
}

public class array_objects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        Employee[] employees = new Employee[n];
        for(int i = 0; i < n; i++) {
            employees[i] = new Employee(i+1);
        }
        System.out.println("Enter Employee number to search: ");
        int empNum = sc.nextInt();
        int c = 0;
        for(int i = 0; i < n; i++) {
            if(employees[i].id == empNum) {
                System.out.println("Employee found: ID: " + employees[i].id + ", Name: " + employees[i].name + ", Salary: " + employees[i].salary);
                c++;
                break;
            }
        }
        if (c==0) {
            System.out.println("Employee not found.");
        }
       
    }
}
