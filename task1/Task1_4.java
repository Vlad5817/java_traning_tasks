public class Task1_4 {
    public static void main(String args[]) {
        int N = 1234;
        boolean increasing = true, decreasing = true;
        int next_digit = N % 10; N /= 10;
        while (N > 0) {
            int cur_digit = N % 10; N /= 10;
            increasing &= next_digit > cur_digit;
            decreasing &= next_digit < cur_digit;
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
