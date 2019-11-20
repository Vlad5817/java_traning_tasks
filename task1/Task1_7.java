public class Task1_7 {
    public static void main(String[] args) {
        int a = 2, b = 9;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
