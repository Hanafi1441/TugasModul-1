package com.alyaauliahanafi.modul1;

import java.io.IOException;
import java.util.Scanner;

public class Nomor3 {//class

    public static class Pendaftaran {//class
        String nama, asal, nilai, asalSek, jurusan;//deklarasi variable dengan tipe data string
        int tahunLul, umur;//deklarasi dengan tipe data integer

        //constructor
        public Pendaftaran(String nama, String asal, String nilai, String asalSek, String jurusan, int tahunLul, int umur) {
            this.nama = nama;
            this.asal = asal;
            this.nilai = nilai;
            this.asalSek = asalSek;
            this.jurusan = jurusan;
            this.tahunLul = tahunLul;
            this.umur = umur;
        }
        //class mencetak data setelah input data
        void cetak() {
            System.out.println("=========== Konfirmasi Pendaftaran =========");
            System.out.println();
            System.out.println("Nama\t\t\t\t:" + nama);
            System.out.println("Asal Daerah\t\t\t:" + asal);
            System.out.println("Kota Asal Sekolah\t:" + asalSek);
            System.out.println("Nilai UTBK\t\t\t:" + nilai);
            System.out.println("Umur\t\t\t\t:" + umur);
            System.out.println("Tahun Lulus\t\t\t:" + tahunLul);
            System.out.println("Pilihan Prodi\t\t:" + jurusan);
            System.out.println(nama + ", Anda telah berhasil melakukan pendaftaran ");
        }

    }

    public static String input() {//class
        int car;//deklarasi
        String string = "";
        boolean a = false;
        while (!a) {//perulangan
            try {
                car = System.in.read();//membaca car
                if (car < 0 || (char) car == '\n')//percabangan
                    a = true;//inisialisasi variable a bernilai benar
                else if (car != '\r')
                    string = string + (char) car;


            } catch (IOException exception) {
                System.err.println("Terjadi kesalahan saat input!!");
                a = true;
            }
        }
        return string;//mengembalikan string
    }

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);//membaca inputan
        char pilih = 'Y';//deklarasi dan inisialisasi

        while (pilih == 'Y') {//perulangan
            try {
                System.out.println("======= PENDAFTARAN MAHASISWA BARU ITTP =======");
                System.out.println("");
                System.out.println("Selamat Datang di laman resmi Institut Teknologi Telkom Purwokerto");
                System.out.println("==================================================================");
                System.out.println("");
                System.out.println("Silahkan isi data dibawah ini");
                System.out.print("Nama\t\t\t\t:");
                String nama = i.next();//memasukan inputan
                System.out.print("Asal Daerah\t\t\t:");
                String asal = i.next();
                System.out.print("Kota Asal Sekolah\t:");
                String asal1 = i.next();
                System.out.print("Nilai UTBK\t\t\t:");
                String nilai = i.next();
                System.out.print("Umur\t\t\t\t:");
                int umur = i.nextInt();
                System.out.print("Tahun Lulus\t\t\t:");
                int tahun = i.nextInt();
                System.out.print("Pilihan Prodi\t\t:");
                String prod = i.next();
                // membuat objek baru
                Pendaftaran pendaftaran = new Pendaftaran(nama, asal, nilai, asal1, prod, tahun, umur);
                //memanggil method cetak di class pendaftaran
                pendaftaran.cetak();
            } catch (NumberFormatException exception) {
                System.err.println("Terjadi kesalahan saat input data, pendaftaran gagal");
            }
            System.out.println("\n Lakukan Pendaftaran lagi ?(Y/T)");
            String string = Nomor3.input();
            pilih = string.charAt(0);
            if (pilih == 'Y') continue;//jika pilih Y
            //melakukan pendaftaran ulang
            else {//jika tidak
                System.out.println("Terima Kasih sudah melakukan pendaftaran di laman ITTP")
                ;//program exit
                break;
            }
        }
    }
}
