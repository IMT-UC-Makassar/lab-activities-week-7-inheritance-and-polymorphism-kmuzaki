package oop.lab;

public class PlatinumCard extends CreditCard{

    public PlatinumCard(String num, String name) {
        super(num, name);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public double getInterestRate(){
        return 0;
    }
}
