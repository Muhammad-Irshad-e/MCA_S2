import java.util.*;
class nameException extends RuntimeException {
    nameException(String message) {
        super(message);
    }
}

class passException extends RuntimeException {
    passException(String message) {
        super(message);
    }
}

class user
{
    String name;
    String password;

    user(String n, String pass) {
        this.name = n;
        this.password = pass;
    }

    void login( String n, String pass) {
        try {
            if(name.equals(n) && password.equals(pass))
            {
                System.out.println("Login successful");
            }
            else
            {
                throw new nameException("Invalid username or password");
            }
        }
        catch (nameException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

    }
    }
public class validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username:");
        String n = sc.nextLine();
        try {
            for(int i=0;i<n.length();i++)
            {
                char ch = n.charAt(i);
                if((ch >=65 && ch <=90) || (ch >=97 && ch <=122))
                {
                    continue;
                }
                else
                {
                    throw new nameException("Invalid username");
                }
            }
        }
        catch (nameException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }



        System.out.println("Enter password:");
        String pass = sc.nextLine();
        try {
            int p = 0;
            if(pass.length() < 8)
            {
                throw new nameException("Password must be at least 8 characters long");
            }
            for(int i=0;i<pass.length();i++)
            {
                char ch = pass.charAt(i);
                if((ch >=48 && ch <=57))
                {
                    p = 1;
                }
                
             } 
             if (p == 0)
             {
                throw new passException("Password must contain at least one digit");
             }

            }
            catch (nameException e) {
                System.out.println(e.getMessage());
                System.exit(0);
            }
            catch (passException e) {
                System.out.println(e.getMessage());
                System.exit(0);
            }


        user u = new user(n, pass);
        System.out.println("\t\tLogin!!");
        System.out.print("Username: ");
        String n1 = sc.nextLine();
        System.out.print("Password: ");
        String pass1 = sc.nextLine();
        u.login(n1, pass1);
    }
}

