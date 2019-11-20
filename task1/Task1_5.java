
public class Task1_5 {
    public static void main(String args[])
    {
        int N = 654321;
        float arithmeticMean = 0, geometricMean = 1;
        for (int i = 0; i < 6; i++) {
            arithmeticMean += N % 10 / 6.;
            geometricMean *= Math.pow(N % 10, 1./6.);
            N /= 10;
        }
        System.out.println("среднее арифметическое: " + arithmeticMean);
        System.out.println("среднее геометрическое: " + geometricMean);
    }
}
