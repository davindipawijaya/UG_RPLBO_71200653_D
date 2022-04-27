package com.ug10.etransactionproject;

public class MobileWallet {
    private String noHp;
    private long feeTransferBank;

    public MobileWallet(String noHp, long feeTransferBank, String string) {
        this.noHp = noHp;
        this.feeTransferBank = feeTransferBank;
        this.toString();
    }

    public void setFeeTransferBank(long feeTransferBank) {
        this.feeTransferBank = feeTransferBank;
    }

    public String getNoHp() {
        return noHp;
    }

    public void transfer(DigitalPayment dp, long nominal) {

    }
}
