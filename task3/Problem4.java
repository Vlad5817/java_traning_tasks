public class Problem4 {
    public static boolean isFriends(int a, int b){
        return Problem3.sumOfDivisors(a) == b && Problem3.sumOfDivisors(b) == a;
    }
    public static void main(String[] args) {
        int start = 100, end = 10000;
        for (int i = start; i < end + 1; i++) {
            for (int j = i + 1; j < end; j++) {
                if (isFriends(i, j)) {
                    System.out.printf("%d %d\n", i, j);
                }
            }
        }
    }
}
