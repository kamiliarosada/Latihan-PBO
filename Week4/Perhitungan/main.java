package Perhitungan;
import java.util.Scanner;

public class main {
        public static void main(String[] args) {
        kalkulator calc = new kalkulator();
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        int Penjumlahan = calc.tambah(angka1, angka2);
        int Pengurangan = calc.kurang(angka1, angka2);
        int Perkalian = calc.kali(angka1, angka2);

        System.out.println(angka1 + " + " + angka2 + " = " + Penjumlahan);
        System.out.println(angka1 + " - " + angka2 + " = " + Pengurangan);
        System.out.println(angka1 + " * " + angka2 + " = " + Perkalian);

    }
    
}

