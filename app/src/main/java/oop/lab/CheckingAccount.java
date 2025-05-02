package oop.lab;

public class CheckingAccount extends BankAccount implements OnlineService{

    public CheckingAccount(String number, String name, double moneh) {
        super(number, name, moneh);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void calculateInterest() {
        // TODO Auto-generated method stub
        deposit(getBalance() * 0);
    }

    @Override
    public void payBills(double amount) {
        // TODO Auto-generated method stub
        withdraw(amount);
    }

    @Override
    public void transferFunds(double tfAmmount, String accNumDest) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'transferFunds'");
    }
    
}
