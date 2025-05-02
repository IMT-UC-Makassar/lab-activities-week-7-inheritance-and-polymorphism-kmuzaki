package oop.lab;

public class BusinessAccount extends BankAccount implements OnlineService, LoanService{
    private String loanStatus;

    public BusinessAccount(String number, String name, double moneh) {
        super(number, name, moneh);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void calculateInterest() {
        deposit(getBalance() * 0.25);
    }


    @Override
    public void applyForLoan(double amount) {
        this.loanStatus = "Pending";
    }


    @Override
    public String checkLoanStatus() {
        return loanStatus;
    }

    @Override
    public void payBills(double amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'payBills'");
    }

    @Override
    public void transferFunds(double tfAmmount, String accNumDest) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'transferFunds'");
    }
    
}
