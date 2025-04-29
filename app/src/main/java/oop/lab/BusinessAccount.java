package oop.lab;

public class BusinessAccount extends BankAccount{
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

    public void applyForLoan(double amount){

    }

    public String checkLoanStatus(){
        return "You have " + loanStatus + " for loans";
    }
    
}
