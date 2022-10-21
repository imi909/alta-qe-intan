package OngkosKirim;

import java.util.Scanner;

public class Ongkir {
    public static void main(String[] args) {

         int panjang, lebar, tinggi, berat;

         for (berat=1000; berat<=(5000-1); berat++);


        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan angka : ");

        panjang = scan.nextInt();
        lebar = scan.nextInt();
        tinggi = scan.nextInt();

        System.out.println("Harga Ongkir : Rp " + berat );
    }
}
