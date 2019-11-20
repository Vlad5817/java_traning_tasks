public class Task1_4 {
    static int getDigit(int number, int position) {
        return (number / (int)Math.pow(10, position)) % 10;
    }
    public static void main(String args[]) {
        int N = 7531;
        boolean increasing = true, decreasing = true;
        for (int i = 0; i < 3; i++) {
            increasing &= getDigit(N, i) > getDigit(N, i + 1);
            decreasing &= getDigit(N, i) < getDigit(N, i + 1);
            if (!increasing && !decreasing) break;
        }
        if (increasing)
            System.out.println("возрастающая последовательность");
        else if (decreasing)
            System.out.println("убывающая последовательность");
        else
            System.out.println("немонотонная последовательность");
    }
}
