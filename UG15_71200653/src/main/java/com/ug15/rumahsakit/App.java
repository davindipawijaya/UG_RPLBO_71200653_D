package com.ug15.rumahsakit;

public class App {
    public static void main(String[] args, int x) {
        System.out.println( "=====PROSES INISIALISASI=====" );
        System.out.println();
        Jadwal jadwal = new Jadwal();
        Pasien illegal = new Pasien("test",21,"di mana saja");
        Pelayanan pelayanan = new Pelayanan("Andi");
        Suster suster = new Suster("Siti");
        Dokter dokter = new Dokter("Budi", "Organ Dalam", "A123");
        Pasien pasien = pelayanan.registrasi();
        pelayanan.mengaturJadwal(pasien, dokter, jadwal);
        System.out.println("=====PROSES UJI COBA PASIEN DAN JADWAL ILLEGAL=====");
        System.out.println();
        suster.screening(illegal, jadwal);
        dokter.memeriksa(illegal, jadwal);
        System.out.println("=====PROSES UJI COBA PASIEN DAN JADWAL ILLEGAL BERHASIL=====");
        System.out.println();
        System.out.println("=====PROSES SCREENING SUSTER=====");
        System.out.println();
        suster.screening(pasien, jadwal);
        System.out.println("=====PROSES SCREENING SUSTER BERHASIL=====");
        System.out.println();
        System.out.println("=====PROSES PEMERIKSAAN DOKTER=====");
        System.out.println();

        int j = 0;
        for (int i = 0; j <= x; j++) {
            dokter.memeriksa(pasien, jadwal);
            dokter.cekStatus(pasien);
        }
        System.out.println("=====PROSES PEMERIKSAAN DOKTER BERHASIL=====");
        System.out.println();

        System.out.println(jadwal.getPasien().getStatus());
        System.out.println(jadwal.getPasien().getLevelPenyakit());
    }
}
