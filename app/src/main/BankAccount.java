public abstract class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private Double balance;

    public BankAccount (String number, String name){
        this.accountNumber = number;
        this.accountHolder = name;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

    public double getBalance(){
        return balance;
    }

    public abstract void calculateInterest();
}
