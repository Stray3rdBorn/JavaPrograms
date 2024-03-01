import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=input.nextInt();
        int[] arr= new int[n];
        int sum=0;
        for(int i=0; i<n; i++){
            System.out.printf("Enter the value of arr["+ i+"] = ");
            arr[i]= input.nextInt();
        }

        for(int i=0; i<n; i++){
             sum= sum + arr[i];

        }
        System.out.println("Summation of "+n+ "number is: "+ sum);
        
    }
}