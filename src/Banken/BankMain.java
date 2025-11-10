package Banken;

import java.util.Scanner;

public class BankMain {
    static void main() {


        BankAccount vahidsKonto = new BankAccount();
        vahidsKonto.setSaldo(500);

        vahidsKonto.minusSaldo(300);
        vahidsKonto.saldoUtskrift();



    }
}
