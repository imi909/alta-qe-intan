public class Problem7Mean {
    private static float Mean(float[] number) {
        float sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        return sum / number.length;
    }

    public static void main(String[] args) {
        float[] value = {1, 2, 3, 4};
        System.out.println(Mean(value));
    }
}
