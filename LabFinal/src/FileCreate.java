import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileCreate {
    public static void main(String[] args) throws FileNotFoundException {
        
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("Input.txt"));
             Scanner input =  new Scanner(System.in);
             System.out.println("Enter number of records: ");
             int num = input.nextInt();
             for(int i=0; i<num; i++)
             {
                 System.out.print("Enter name: ");
                 String name = input.next();
                 bw.write(name);
                 System.out.println("");
             }
            
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(FileCreate.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            BufferedReader br = new BufferedReader(new FileReader("Input.txt"));
            Scanner input = new Scanner(br);
            while(input.hasNextLine()){
            String data = input.nextLine();
                try {
                String name = data;
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/labfinal" , "root" , "110022");
                String query = "INSERT INTO students VALUES(?)";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, name);
                pst.executeUpdate();
                br.close();
                }
                catch (Exception ex) {
                System.out.println(ex);
                }
            
            }
            
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(FileCreate.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/labfinal", "root", "110022");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            System.out.println("Name");
            System.out.println("----");
            while(rs.next()){
                String name = rs.getString("name");
                System.out.print(name);
                System.out.println("");
            }
            stmt.close();
        }
        catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(FileCreate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
}
