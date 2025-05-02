package oop.lab;

public abstract class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private Double balance;

    public BankAccount (String number, String name, double moneh){
        this.accountNumber = number;
        this.accountHolder = name;
        this.balance = moneh;
    }

    // Deposit and withdraw
    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        if (amount > this.balance) {
            throw new IllegalArgumentException("Insufficient funds");
        } else {
            this.balance -= amount;
            System.out.println("Withdraw successful");
        }
        
    }


    // Getter methods
    public double getBalance(){
        return balance;
    }

    public String getNumber(){
        return accountNumber;
    }

    public String getHolderName(){
        return accountHolder;
    }


    //Abstract method for calcInterest
    public abstract void calculateInterest();
}
