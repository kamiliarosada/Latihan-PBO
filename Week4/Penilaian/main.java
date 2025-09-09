package Penilaian;

import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();
        ceknilai cekNilai = new ceknilai();
        System.out.println("Grade: " + cekNilai.cek(nilai));
}
}
