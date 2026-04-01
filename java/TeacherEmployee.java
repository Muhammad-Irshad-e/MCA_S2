class Employee{
    int empid;
    String name;
    double salary;
    String address;

    Employee(int empid, String name, double salary, String address)
    {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

}

class Teacher extends Employee {
    String dept;
    int subjectCode;
    String subjectName;

    Teacher(int empid, String name, double salary, String address, String dept, int subjectCode, String subjectName)
    {
        super(empid, name, salary, address);
        this.dept = dept;
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;

    }

    void display()
    {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + dept);
        System.out.println("Subject Code: " + subjectCode);
        System.out.println("Subject Name: " + subjectName);
    }
}


public class TeacherEmployee {
    public static void main(String[] args) {
        Teacher[] teachers = new Teacher[3];
        teachers[0] = new Teacher(1, "Ajmal U K", 50000, "Iritti", "Computer Science", 101, "Data Structures");
        teachers[1] = new Teacher(2, "Amarjith", 55000, "Panoor", "Mathematics", 102, "Calculus");
        teachers[2] = new Teacher(3, "Rashid K P", 60000, "Payyannur", "Physics", 103, "Quantum Mechanics");
        for (Teacher teacher : teachers) {
            teacher.display();
            System.out.println();
        }
    }

}
