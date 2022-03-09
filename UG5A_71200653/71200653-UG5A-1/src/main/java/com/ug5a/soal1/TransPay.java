package com.ug5a.soal1;

public class TransPay {
    private String nama;
    private Long saldo;

    public void setNama(String newNama) {
        nama = newNama;
    }
    public void setSaldo(long newSaldo) {
        saldo = newSaldo;
    }
    public String getNama() {
        return nama;
    }
    public long getSaldo() {
        return saldo;
    }
    public void topUp(long newTopUp){
        if (newTopUp>=0) {
            saldo = newTopUp + saldo;
            System.out.println("Top up sebesar Rp "+newTopUp+" berhasil");

        }else if(newTopUp<=0) {
            System.out.println("Nominal anda tidak valid! Nominal harus lebih dari 0");
        }
    }
    public void bayar(int jumlah, Keyboard k){
        if (jumlah>0 && saldo >= (k.getHarga())){
            saldo = saldo - (k.getHarga());
            System.out.println("Pembayaran Berhasil! Silahkan mengambil "+k.getMerkModel()+" di counter");

        }else if(jumlah>0 && saldo < (jumlah*k.getHarga())){
            System.out.println("Pembayaran Gagal Saldo Anda Kurang");
        }else{
            System.out.println("Input Jumlah tidak Valid!");
        }
    }
}
