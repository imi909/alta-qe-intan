import java.util.Scanner;

public class Problem5Palindrome {
    private static String palindrome(String value){
        return value;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kata : ");

        String value = input.nextLine();
        char[] huruf = value.toCharArray();

        String value2 = "";
        for (char c : huruf){
            value2 = c + value2;
        }

        if (!value.equals(value2)){
            System.out.println(value + " Bukan Palindrome");
        } else {
            System.out.println(value + " Ini Palindrome");
        }
    }
}
