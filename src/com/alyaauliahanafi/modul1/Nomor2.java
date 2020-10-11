package com.alyaauliahanafi.modul1;

public class Nomor2 {//class
    private static String nama = "Natsu";
    private static int setUmur (){
        int umur = 29;//deklarasi dan inisialisasi variable umur
        return umur;//mengembalikan nilai
    }
    private static String jabatan = "Manajer";
    private static int setKode (){//
        int kode = 1855505;
        return kode;//mengembalikan nilai
    }
    private static String alamat = "Perumahan GKI";
    private static int setNotelp (){
        int notel = 199872809;
        return notel;
    }
    public static void main(String[] args) {//class main
        System.out.println("Data Karyawan");
        System.out.println("Nama\t\t:"+nama);
        System.out.println("Umur\t\t:"+setUmur());
        System.out.println("Jabatan\t\t:"+jabatan);
        System.out.println("Kode\t\t:"+setKode());
        System.out.println("Alamat\t\t:"+alamat);
        System.out.println("No Telpon :"+setNotelp());
        
    }
}
