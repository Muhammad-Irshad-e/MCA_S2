import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Scanner;
public class FileManage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the filename :");
        String filename = sc.nextLine();
        System.out.println("Enter the content to write into the file :");
        String content = sc.nextLine();

        try{
            FileOutputStream fileoutputStream = new FileOutputStream(filename);
            fileoutputStream.write(content.getBytes());

            System.out.println("File content :");
            FileInputStream fileinputStream = new FileInputStream(filename);
            int data = fileinputStream.read();
            while(data != -1)
            {
                System.out.println((char)data);
                data = fileinputStream.read();
            }
            fileinputStream.close();
        }
        catch (IOException e)
        {
            System.err.println();
        }
    }
}
