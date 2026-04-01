import java.util.*;
class stack<T> {
    ArrayList<T> A;
    int top = -1;
    int size;
    stack(int size) {
        this.size = size;
        this.A = new ArrayList<T>(size);
    }

    void push(T data) {
        if (top == size - 1) {
            System.out.println("Stack is full");
        } 
        else {
            top++;
            if (A.size() > top) {
                A.set(top, data);
            } 
            else {
             A.add(data);
            }
        }
    }

    T top() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return null;
        } 
        else {
            return A.get(top);
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } 
        else {
            top--;
        }
    }

    boolean empty() {
        return top == -1;
    }
    public String toString() {
        String Ans = "";
        for (int i =0; i <= top; i++) {
            Ans += String.valueOf(A.get(i)) + " ";
        }
        Ans = String.valueOf(A.get(top));
        return Ans;
    }
}

public class GenericStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack:");
        int size = sc.nextInt();
        stack<Integer> s = new stack<>(size);
        int v;
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element to push:"+(i+1)+": ");
            v = sc.nextInt();
            s.push(v);
        }
        System.out.println("\n Stack after pushing "+ size + " elements: \n" + s);
        s.pop();
        System.out.println("\n Stack after popping one element: \n" + s);
    }
}
