package com.ug7.ewallet;

public class eWallet {
    private User user;
    private int saldo;

    public eWallet(User user){
        this.user = user;
        this.saldo = saldo;
    }

    public int topup(int jumlah){
        this.saldo += jumlah;
        return saldo;
    }

    public void transfer(eWallet eWallet, int jumlah){
        this.saldo -= jumlah;
    }

    public void withdraw(int jumlah){
        this.saldo += jumlah;
    }

    public void getInfo(){

    }
}
