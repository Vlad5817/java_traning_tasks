public class Task1_2 {
    static String formatWeight(double weight)
    {
		long miligrams = (long) (weight * 1000000);
		long grams = miligrams / 1000;
        long kilos = grams / 1000;
        long tones = kilos / 1000;
        return String.format("%d тонн, %d киллограмм, %d грамм, %d милиграмм",
        		tones, kilos%1000, grams%1000, miligrams%1000);
    }
    public static void main(String args[])
    {
        System.out.println(formatWeight(654321.123456));
    }
}
