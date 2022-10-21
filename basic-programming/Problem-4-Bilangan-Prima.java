import java.util.Scanner;

public class Problem4BilanganPrima {
    private static int primeNumber(int number) {

        return number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menentukan Bilangan Prima");
        System.out.println("-------------------------------");
        System.out.println();

        int n,i;
        boolean number = true;

        System.out.println("Input sebuah angka : ");
        n = input.nextInt();

        if (n==0 || n==1){
            number = false;
        } else {
            for (i=2; i<=n/2; i++){
                if (n%i==0){
                    number = false;
                    break;
                }
            }
        }
        if (number){
            System.out.println(n + " adalah bilangan prima");
        } else {
            System.out.println(n + " adalah bukan bilangan prima");
        }
    }
}
