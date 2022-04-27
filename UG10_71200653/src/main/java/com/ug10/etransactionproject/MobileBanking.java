package com.ug10.etransactionproject;

public class MobileBanking {
    private boolean checkFee;
    private long feeAntarBank;
    private String noRekening;

    public MobileBanking(String checkFee, long feeAntarBank, String noRekening) {
        this.checkFee = Boolean.parseBoolean(checkFee);
        this.feeAntarBank = feeAntarBank;
        this.noRekening = noRekening;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public void transfer(DigitalPayment dp, long nominal) {

    }

    public boolean isCheckFee() {
        return checkFee;
    }

    public void setCheckFee(boolean checkFee) {
        this.checkFee = checkFee;
    }
}
