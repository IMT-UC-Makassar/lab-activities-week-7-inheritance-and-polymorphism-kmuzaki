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
        try {
            this.balance -= amount;
        } catch (Exception e) {
            System.out.println("Insufficient funds");
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
