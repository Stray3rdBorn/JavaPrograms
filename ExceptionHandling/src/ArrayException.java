import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            int[] arr = new int[5];
            arr[6] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("Exception is handled");
        }
    }
}
