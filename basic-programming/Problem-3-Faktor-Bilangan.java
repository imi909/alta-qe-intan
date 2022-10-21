import java.util.Scanner;
public class Problem3FaktorBilangan {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Masukkan angka");
        int nilai = a.nextInt();
        System.out.println("Faktor-faktornya : ");
        int bilangan = 0;
        for (int z=0; z<=nilai; z++ ){
            bilangan++;
            if (nilai%bilangan==0){
                System.out.println(bilangan + " faktor");
            }
        }
    }
}