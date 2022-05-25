package com.ug13.projectkassa;

public class Kasir {
    private String password;
    private long totalPenjualan;
    private String username;
    private String nama;

    public long getTotalPenjualan() {
        return totalPenjualan;
    }

    public String getPassword() {
        return password;
    }

    public String getNama() {
        return nama;
    }

    public String getUsername() {
        return username;
    }

    public void setTotalPenjualan(long totalPenjualan) {
        this.totalPenjualan = totalPenjualan;
    }
}
