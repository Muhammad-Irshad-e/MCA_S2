import java.util.Scanner;
public class SymmetricMatrix {
    public static void main(String[] args) {
        int size = 3;
        int matrix[][] = new int[size][size];
        Scanner s = new java.util.Scanner(System.in);
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        boolean isSymmetric = true;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
        }
        if (isSymmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
    } 
}
