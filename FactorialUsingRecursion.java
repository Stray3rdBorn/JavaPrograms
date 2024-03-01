import java.util.Scanner;

public class FactorialUsingRecursion{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter the value of n: ");
        num = input.nextInt();
        long factorial = fact(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
 static  long fact(int num)
    {
        if (num >= 1)
            return num * fact(num - 1);
        else
            return 1;
    }
}
