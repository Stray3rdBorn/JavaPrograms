import java.util.Formatter;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) {
        String name, id;
        try {
            Scanner input = new Scanner(System.in);
            Formatter formatter= new Formatter("D:/Study Materials/Java/FileOperations/Input.txt");
            System.out.println("Enter your name: ");
            name= input.next();
            System.out.println("Enter your id: ");
            id= input.next();
            formatter.format("%s %s \r\n", name, id);
            System.out.println("File write successful");
            formatter.close();
        }

        catch (Exception e){
            System.out.println(e);
        }

    }
}
