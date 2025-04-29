package oop.lab;

public class CreditCard extends Card{

    public CreditCard(String num, String name) {
        super(num, name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double getInterestRate(){
        return 0;
    }
    
}
