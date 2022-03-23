package com.ug7.ewallet;

public class GoPay {
    private int feeTopup;
    private int feeTransfer;
    private int feeWithdraw;
    private int saldoGoPay;
    private User user;

    public GoPay(User user){
        this.user = user;
    }

    public void topup(int jumlah){
        this.saldoGoPay += jumlah;
    }

    public void transfer(ShopeePay eWallet, int jumlah){
        this.saldoGoPay -= jumlah;
    }

    public void withdraw(int jumlah){
        this.saldoGoPay += jumlah;
    }

    public void getinfo(){

    }

    public void setFeeTopup(int feeTopup) {
        this.feeTopup = feeTopup;
    }

    public void setFeeWithdraw(int feeWithdraw) {
        this.feeWithdraw = feeWithdraw;
    }

    public void setFeeTransfer(int feeTransfer) {
        this.feeTransfer = feeTransfer;
    }

    public int getInfo(){
        return saldoGoPay;
    }

    public User getUser(){
        return user;
    }
}
