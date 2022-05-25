package com.ug13.projectkassa;

import java.util.ArrayList;
import java.util.HashMap;

public class Kassa<Produk> extends Kasir{
    private HashMap<Produk,Integer> pesanan;
    private ArrayList<Kasir> arrKasir;
    private Kasir kasir;

     public void login(String kasir1, String kasir2) {

     }
     public void register(Kasir kasir) {

     }
     public void tambahPesanan(Produk Produk, int pesanan) {

     }
     public void printNota() {

     }
     public ArrayList<Kasir> printPenjualanKasir() {
         return arrKasir;
     }


}
