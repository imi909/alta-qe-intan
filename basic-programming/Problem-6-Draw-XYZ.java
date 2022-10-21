public class Problem6DrawXYZ {
    private static void DrawXYZ(int n){
        for (int i=0; i<n; i++){
            int huruf = i*n;

            for (int j=(huruf+1); j<=(huruf+n); j++){
                if (j%3 == 0){
                    System.out.print("X ");
                } else if (j%2 == 0) {
                    System.out.print("Z ");
                } else {
                    System.out.print("Y ");
                }
            }

            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        DrawXYZ(3);
    }
}
