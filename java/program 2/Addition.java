import java.util.Scanner;

class Addition {

    static int arr1[][];
    static int arr2[][];

    public static void main(String args[]) {
        arr1 = new int[4][4];
        arr2 = new int[4][4];
        Scanner s = new Scanner(System.in);

            for (int i = 0; i <= 3; i++) {
                for (int j = 0; j <= 3; j++) {
                    System.out.println("Enter a number for (" + i + "," + j + ") th position for first matrix:");
                    int n = s.nextInt();
                    arr1[i][j] = n;
                }

            }
            for (int i = 0; i <= 3; i++) {
                for (int j = 0; j <= 3; j++) {
                    System.out.println("Enter a number for (" + i + "," + j + ") th position for second matrix:");
                    int n = s.nextInt();
                    arr1[i][j] = n;
                }

            }
            System.out.println("The addition of two matrix is:");
            for (int i = 0; i <= 3; i++) {
                for (int j = 0; j <= 3; j++) {
                    System.out.print((arr1[i][j] + arr2[i][j]) + " ");
                }
                System.out.println();
            }
        
    }
}