public class SavingsAccount extends Account {
    SavingsAccount(int acc_number, double balance, double rate){
        super(acc_number, balance, rate);
    }
    void withdraw(double amount){
        if(amount > 0 && amount<=balance){
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " +balance);
        }
        else{
            System.out.println("Withdrawal failed or invalid fund.");
        }

    }
    void deposit(double amount){
        if(amount > 0){
            System.out.println("Account number: " +acc_number+ " Current balance: " +balance);
            balance +=amount;
            System.out.println("Deposit successful. New balance: " +balance);
        }
        else{
            System.out.println("Invalid fund.");
        }
    }
    void interest(){
        double interest = balance * rate;
        System.out.println("Interest: " +interest);
        balance += interest;
        System.out.println("Balance with interest: " +balance);
    }
}
