import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=0, b=1, n;
        System.out.println("Enter the value of n :");
        n= input.nextInt();
        System.out.println("Fibonacci series are: ");
        for(int i=0; i<n; i++){
            System.out.printf(a + ", ");

            int res= a +b;
             a=b;
             b= res;


        }
    }
}