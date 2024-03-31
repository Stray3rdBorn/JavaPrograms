// Custom exception create and handled.
import java.util.Scanner;
class NegativeNumber extends Exception{
    NegativeNumber(String str){
        super(str);
    }
}
class VotingSystem extends Exception{
    VotingSystem(String str){
        super(str);
    }
}
public class CustomException{
    public static void main(String[] args) throws Exception{
        Scanner input =new Scanner(System.in);
        System.out.println("1.Age less than zero exception\n2.Check adult\n");
        System.out.println("Enter your choice: ");
        while (true){
            int choice = input.nextInt();
            switch (choice){
                case 1:{
                    try {
                        System.out.println("Enter your age: ");
                        int age =input.nextInt();
                        if(age<0){
                            throw new NegativeNumber("Age can not be negative. Please enter positive age.");
                        }

                    }
                    catch (NegativeNumber e){
                        System.out.println("The name of exception is: "+ e + "\n");
                    }
                    break;
                }
                case 2:{
                    try {
                        System.out.println("Enter your age: ");
                        int age =input.nextInt();
                        if(age<18)
                        {
                            throw new VotingSystem("You are an child. Yor are not eligible for vote.");
                        }
                        else {
                            System.out.println("You are eligible fo voting.");
                        }

                    }
                    catch (VotingSystem e){
                        System.out.println("The name of exception is: "+ e + "\n");
                    }
                    finally {
                        System.out.println("This is finally block code");
                    }
                    break;
                }
                default:{
                    System.out.println("Invalid choice.Please try again.\n");
                    break;
                }
            }

        }

    }
}
