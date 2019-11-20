public class Task1_6 {
    public static void main(String[] args) {
        int N = 1234567, reverceN = 0;
        for (int i = 0; i < 7; i++) {
            reverceN = reverceN * 10 + N % 10;
            N /= 10;
        }
        System.out.println(reverceN);
    }
}
