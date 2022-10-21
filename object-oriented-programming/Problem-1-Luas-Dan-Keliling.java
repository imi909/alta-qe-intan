import java.util.Scanner;

class LuasKeliling{
    int luas, keliling,p,l,t,s,a,b,c,d;
    double rumus = (double) 1/2;

    Scanner scan = new Scanner(System.in);

    public void setLuas(int luas){
        this.luas = luas;
    }

    public void setKeliling(int keliling){
        this.keliling = keliling;
    }

    void persegi(){
        s = scan.nextInt();
        luas = s*s;
        System.out.println("Hasil Luas = " + luas);
        keliling = 4*s;
        System.out.println("Hasil Keliling = " + keliling);
    }

    void persegiPanjang(){
        p = scan.nextInt();
        l = scan.nextInt();
        luas = p*l;
        System.out.println("Hasil Luas = "+ luas);
        keliling = 2*(p+l);
        System.out.println("Hasil Keliling = " + keliling);
    }

    void segitiga(){
        a = scan.nextInt();
        t = scan.nextInt();
        b = scan.nextInt();
        luas = (int) (rumus*a*t);
        System.out.println("Hasil Luas = " + luas);
        keliling = a*b*t;
        System.out.println("Hasil Keliling = " + keliling);

    }
}

public class LuasDanKeliling extends LuasKeliling{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("---Menghitung Luas dan Keliling Persegi---");
        System.out.println("Masukkan Angka : ");
        LuasKeliling luasKelilingPersegi = new LuasDanKeliling();
        luasKelilingPersegi.persegi();
        System.out.println();

        System.out.println("---Menghitung Luas dan Keliling Persegi Panjang---");
        System.out.println("Masukkan Angka : ");
        LuasKeliling luasKelilingPersegiPanjang = new LuasDanKeliling();
        luasKelilingPersegiPanjang.persegiPanjang();
        System.out.println();

        System.out.println("---Menghitung Luas dan Keliling Segitiga---");
        System.out.println("Masukkan Angka : ");
        LuasKeliling luasKelilingSegitiga = new LuasDanKeliling();
        luasKelilingSegitiga.segitiga();
        System.out.println();
    }
}
