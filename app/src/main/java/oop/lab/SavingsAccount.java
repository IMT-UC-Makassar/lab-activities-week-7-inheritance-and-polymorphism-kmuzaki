package oop.lab;
public class SavingsAccount extends BankAccount implements OnlineService{

    public SavingsAccount(String number, String name, double moneh) {
        super(number, name, moneh);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void calculateInterest() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateInterest'");
    }

    @Override
    public void transferfunds() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'transferfunds'");
    }

    @Override
    public void payBills(double amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'payBills'");
    }

    
}