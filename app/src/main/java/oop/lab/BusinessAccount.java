package oop.lab;

public class BusinessAccount extends BankAccount implements OnlineService, LoanService{
    private String loanStatus;

    // public BusinessAccount(String number, String name, double moneh) {
    //     super(number, name, moneh);
    //     //TODO Auto-generated constructor stub
    // }

    public BusinessAccount(String number, String name, double moneh, String loan) {
        super(number, name, moneh);
        this.loanStatus = loan;
        //TODO Auto-generated constructor stub
    }


    @Override
    public void calculateInterest() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateInterest'");
    }


    @Override
    public void applyForLoan(double amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'applyForLoan'");
    }


    @Override
    public String checkLoanStatus() {
        return "You currently have this much loan: " + loanStatus;
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
