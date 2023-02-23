package com.cognizant.shapes;

class Bank {
    double getInterestRate() {
        return 0;
    }
}

class SBI extends Bank {
    double getInterestRate() {
        return 8.0;
    }
}

class ICICI extends Bank {
    double getInterestRate() {
        return 7.0;
    }
}

class AXIS extends Bank {
    double getInterestRate() {
        return 9.0;
    }
}

public class BankInterest {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank axis = new AXIS();

        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + icici.getInterestRate() + "%");
        System.out.println("AXIS Interest Rate: " + axis.getInterestRate() + "%");
    }
}
