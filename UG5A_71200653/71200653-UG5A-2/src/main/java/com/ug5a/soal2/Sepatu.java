package com.ug5a.soal2;

public class Sepatu {
    private String kode;
    private static int nextNum=00245101;
    private String merkModel;
    private int ukuran;
    private long harga;
    private int stok;

    public Sepatu(String argsMerkModel, int argsUkuran, long argsHarga, int argsStok) {
        this.merkModel = argsMerkModel;
        this.ukuran = argsUkuran;
        this.harga = argsHarga;
        this.stok = argsStok;
        this.kode="NK"+nextNum;
        nextNum++;
    }

    public String getKode() {
        return kode;
    }

    public String getMerkModel() {
        return merkModel;
    }

    public int getUkuran() {
        return ukuran;
    }

    public long getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }
}

