import java.io.*;

public class FileCreate {
    public static void main(String[] args) {
        File f = new File("D:/Study Materials/Java/FileOperations");
        f.mkdir();
        File f1 = new File("D:/Study Materials/Java/FileOperations/Input.txt");
        try{
            f1.createNewFile();
            System.out.println("File is created");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
