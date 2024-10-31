package com.inheritance.Overriding;

class Bank {
    public Double getInterestRate() {
        return 0.0;
    }
}

class SBI extends Bank {
    @Override
    public Double getInterestRate() {
        return 5.5;
    }
}

class ICICI extends Bank {
    @Override
    public Double getInterestRate() {
        return 6.0;
    }
}

class HDFC extends Bank {
    @Override
    public Double getInterestRate() {
        return 7.0;
    }
}

public class BankExample {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank hdfc = new HDFC();

        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + icici.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate() + "%");
    }
}
