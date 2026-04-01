import java.util.*;
class sort_string
{
    Scanner sc=new Scanner(System.in);
    String s[];
    int n;
    sort_string()
    {
        System.out.println("\nEnter the number of strings:");
        n=sc.nextInt();
        s=new String[n];
        System.out.println("\nEnter the strings:");
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }
    }
    void sort()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(s[j].compareTo(s[j+1])>0)
                {
                    String temp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
            }
        }

    }
    void display()
    {
        System.out.println("\nSorted strings:");
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]+" ");
        }
    }

}
public class StringSort {
    public static void main(String[] args) {
        sort_string obj=new sort_string();
        System.out.println("\nOriginal strings:");
        obj.display();
        obj.sort();
        System.out.println("\nSorted strings:");
        obj.display();
    }
}