package Banken;

public class BankAccount {

    private double saldo;

    public void saldoUtskrift() {
        System.out.println(this.saldo);
    }

    public void plusSaldo(double tal) {
        this.saldo = this.saldo + tal;
    }

    public void minusSaldo(double tal) {
        //this.saldo = this.saldo - tal;
        double num = this.saldo - tal;
        if(num < 0) {
            System.out.println("Du har för lite pengar");
        } else {
            this.saldo = num;
        }
    }


    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

