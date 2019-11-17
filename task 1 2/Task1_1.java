public class Task1_1 {
    public static boolean compareNumbers( Number a, Number b, Number c)
    {
        return a == b && a == c && b == c;
    }
    public static void main(String args[])
    {
        System.out.println(compareNumbers(1,2,3));
    }
}
