import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchEx {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter an number");
            int n = input.nextInt();
            System.out.println("The number is : " + n);
        }
        catch (InputMismatchException e){
            System.out.println(e);
        }
    }
}

