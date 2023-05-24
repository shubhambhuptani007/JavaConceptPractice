package org.example.JavaConcepts.MethodOveriding;

public class Bank {
    public void rateOfInterest(){
        System.out.println("General Interest of Bank");
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.rateOfInterest();
        Bank sbi = new SBIBank();
        sbi.rateOfInterest();
    }
}
class SBIBank extends Bank{
    @Override
    public void rateOfInterest() {
        System.out.println("SBI's rate of interest");
    }
}
class UCOBank extends Bank{
    @Override
    public void rateOfInterest() {
        System.out.println("UCO's rate of interest");
    }
}
class BOBBank extends Bank{
    @Override
    public void rateOfInterest() {
        System.out.println("BOB's rate of interest");
    }
}
