//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsaccount;
        savingsaccount = new SavingsAccount(111,1000.00,0.2);
        savingsaccount.deposit(500);
        savingsaccount.withdraw(200);
        savingsaccount.interest();
    }
}