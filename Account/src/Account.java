public abstract class Account {
    int acc_number;
    double balance;
    double rate;

    Account(){

    }
    Account(int acc_number, double balance, double rate){
        this.acc_number=acc_number;
        this.balance=balance;
        this.rate=rate;
    }
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    abstract void interest();
}
