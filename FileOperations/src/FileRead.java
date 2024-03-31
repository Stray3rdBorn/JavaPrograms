import java.io.File;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        String name, id;
        try{
            File file = new File("D:/Study Materials/Java/FileOperations/Input.txt");
            Scanner input = new Scanner(file);
            while (input.hasNext()){
                name = input.next();
                id = input.next();
                System.out.println("Name: "+name +"\nStudent id: "+id);
            }
            input.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
