public class Task1_7 {
    public static void main(String[] args) {
        int a = 2, b = 9;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.printf("a = %d\nb = %d", a, b);
    }
}
