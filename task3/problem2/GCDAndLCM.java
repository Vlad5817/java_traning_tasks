package problem2;

public class GCDAndLCM {
    public static int GCD(int a, int b){
        while (a != 0 && b != 0){
            if (a > b){
                a %= b;
            } else {
                b %= a;
            }
        }
        return (a != 0 ? a : b);
    }

    public static int LCM(int a, int b, int gcd){
        return a * b / gcd;
    };

    public static int LCM(int a, int b){
        int gcd = GCD(a, b);
        return LCM(a, b, gcd);
    }

    public static void main(String[] args) {
        int someNumber = 12321,
                someElseNumber = 15,
                gcd = GCD(someNumber, someElseNumber),
                lcm = LCM(someNumber, someElseNumber, gcd);
        System.out.printf("%d and %d\nGCD: %d\nLCM:%d\n",
                someNumber, someElseNumber, gcd, lcm);

    }
}
