public class Task1_6 {
    public static void main(String[] args) {
        int N = 1234567, reverceN = 0;
        for (int i = 0; i < 7; i++) {
            reverceN += Task1_4.getDigit(N, i) * (int)Math.pow(10, 6-i);
        }
        System.out.print(reverceN);
    }
}
