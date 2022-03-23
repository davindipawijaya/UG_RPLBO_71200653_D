package com.ug7.ewallet;

public class ShopeePay {
    private int feeTopup;
    private int feeTransfer;
    private int feeWithdraw;
    private int saldoShopeePay;
    private User user;

    public ShopeePay(User user){
        this.user = user;
    }

    public void topup(int jumlah){
        this.saldoShopeePay += jumlah;
    }

    public void transfer(GoPay eWallet, int jumlah){
        this.saldoShopeePay -= jumlah;
    }

    public void withdraw(int jumlah){
        this.saldoShopeePay += jumlah;
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
        return saldoShopeePay;
    }

    public User getUser(){
        return user;
    }
}
