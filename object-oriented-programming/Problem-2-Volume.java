import java.util.Scanner;

public class InputVolume extends VolumeOperation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("---Menghitung Volume Balok---");
        System.out.print("Masukkan Angka : ");
        VolumeOperation volumeBalok = new VolumeOperation();
        volumeBalok.balok();
        System.out.println();

        System.out.println("---Menghitung Volume Kubus---");
        System.out.print("Masukkan Angka : ");
        VolumeOperation volumeKubus = new VolumeOperation();
        volumeKubus.kubus();
        System.out.println();

        System.out.println("---Menghitung Volume Tabung---");
        System.out.print("Masukkan Angka : ");
        VolumeOperation volumeTabung = new VolumeOperation();
        volumeTabung.tabung();
        System.out.println();
    }
}

class VolumeOperation {
    int volume, p,l,t,s,r;
    double phi = (double) 22/7;

    Scanner scan = new Scanner(System.in);

    public void setVolume(int volume){
        this.volume = volume;
    }

    void balok(){
        p = scan.nextInt();
        l = scan.nextInt();
        t = scan.nextInt();
        volume = p*l*t;
        System.out.println("Hasil = " + volume);
    }

    void kubus(){
        s = scan.nextInt();
        volume = s*s*s;
        System.out.println("Hasil = " + volume);
    }

    void tabung(){
        r = scan.nextInt();
        t = scan.nextInt();
        volume = (int) (phi*(r*r)*t);
        System.out.println("Hasil = " + volume);
    }
}
