package com.alyaauliahanafi.modul1;

import java.util.Scanner;

public class Method {
     double hasil,hasil1,hasil2;//deklarasi
    Scanner scanner = new Scanner(System.in);//membaca inputan
    public void Celcius(){
        System.out.print("Masukan besar suhu (Celcius)\t: ");
        int suhu = scanner.nextInt();//memasukan inputan suhu
        //method
         hasil = (suhu*9/5)+32;//method konversi
         hasil1 = suhu+273;
         hasil2 = suhu*4/5;
         //output
        System.out.println("Hasil Konversi ke suhu F\t: "+hasil);
        System.out.println("Hasil Konversi ke suhu K\t: "+hasil1);
        System.out.println("Hasil Konversi ke suhu R\t: "+hasil2);
    }
    public void Farenheit(){
        System.out.print("Masukan besar suhu (Farenheit)\t: ");
        int suhu = scanner.nextInt();
        hasil = ((suhu-32)*5/9)+273;
        hasil1 = (suhu-32)*4/9;
        hasil2 = (suhu-32)*5/9;
        System.out.println("Hasil Konversi ke suhu K\t: "+hasil);
        System.out.println("Hasil Konversi ke suhu R\t: "+hasil1);
        System.out.println("Hasil Konversi ke suhu C\t: "+hasil2);
    }
   public void Kelvin(){
        System.out.print("Masukan besar suhu (Kelvin)\t: ");
        int suhu = scanner.nextInt();
         hasil = (suhu-273)*4/5;
         hasil1 = (suhu-273);
         hasil2 = ((suhu-273)*9/5)+32;
        System.out.println("Hasil Konversi ke suhu R\t: "+hasil);
        System.out.println("Hasil Konversi ke suhu C\t: "+hasil1);
        System.out.println("Hasil Konversi ke suhu F\t: "+hasil2);
    }
    public void Reamur(){
        System.out.print("Masukan besar suhu (Reamur)\t: ");
        int suhu = scanner.nextInt();
         hasil = suhu*5/4;
         hasil1 = (9/4*suhu)+32;
         hasil2 = (5/4*suhu)+273;
        System.out.println("Hasil Konversi ke suhu C\t: "+hasil);
        System.out.println("Hasil Konversi ke suhu F\t: "+hasil);
        System.out.println("Hasil Konversi ke suhu K\t: "+hasil);

    }
}
