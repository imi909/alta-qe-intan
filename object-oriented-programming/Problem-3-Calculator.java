package Calculator;

import java.util.Scanner;

public class Operation {
    int hasil,a,b;

    Scanner scan = new Scanner(System.in);

    public void setHasil(int hasil) {
        this.hasil = hasil;
    }

    void penjumlahan() {
        a = scan.nextInt();
        b = scan.nextInt();
        hasil = a + b;
        System.out.println("Hasil = " + hasil);
    }

    void pengurangan(){
        a = scan.nextInt();
        b = scan.nextInt();
        hasil = a - b;
        System.out.println("Hasil = " + hasil);
    }

    void perkalian(){
        a = scan.nextInt();
        b = scan.nextInt();
        hasil = a*b;
        System.out.println("Hasil = " + hasil);
    }

    void pembagian(){
        a = scan.nextInt();
        b = scan.nextInt();
        hasil = a/b;
        System.out.println("Hasil = " + hasil);
    }
}

class InputAngka extends Operation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Angka : ");
        Operation oprPenjumlahan = new Operation();
        oprPenjumlahan.penjumlahan();

        System.out.print("Masukkan Angka : ");
        Operation oprPengurangan = new Operation();
        oprPengurangan.pengurangan();

        System.out.print("Masukkan Angka : ");
        Operation oprPerkalian = new Operation();
        oprPerkalian.perkalian();

        System.out.print("Masukkan Angka : ");
        Operation oprPembagian = new Operation();
        oprPembagian.pembagian();
    }
}
