package oop.lab;

public class DebitCard extends Card {

    public DebitCard(String num, String name) {
        super(num, name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double getInterestRate() {
        return 2;
    }
    
}
