public class Task1_2 {
    static void printWeight(double weight)
    {
        int tones = (int)weight / 1000,
                kilos =  (int) (weight % 1000),
                grams = (int) (weight % 1 * 1000);
        float miligrams = (int) (weight * 1_000_000 % 1000);
        System.out.printf("%d тонн, %d киллограмм, %d грамм, %f милиграмм", tones, kilos, grams, miligrams);
    }
    public static void main(String args[])
    {
        printWeight(54321.12345);
    }
}
