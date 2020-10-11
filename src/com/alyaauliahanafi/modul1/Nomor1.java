package com.alyaauliahanafi.modul1;

import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {//main
        Scanner scanner = new Scanner(System.in);//membaca inputan
        boolean menu = false;
        do {//perulangan
            //output
            System.out.println("Konversi Suhu");
            System.out.println("1. Celcius");
            System.out.println("2. Farenheit ");
            System.out.println("3. Kelvin");
            System.out.println("4. Reamur ");
            System.out.print("Pilih menu\t: ");
            int pilih = scanner.nextInt();//memasukan pilihan
            switch (pilih) {
                case 1: {
                    Method method = new Method();//memanggil class method
                    method.Celcius();//memanggil method celcius
                }
                break;

                case 2: {
                    Method method = new Method();
                    method.Farenheit();//memanggil method farenheit
                }
                break;

                case 3: {
                    Method method = new Method();
                    method.Kelvin();//memanggil method kelvin
                }
                break;

                case 4: {
                    Method method = new Method();
                    method.Reamur();//memanggil method reamur
                }
                break;

            }
            System.out.println(" ");
        }while (!menu);
    }
}
