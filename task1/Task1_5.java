
public class Task1_5 {
    public static void main(String args[])
    {
        int N = 654321;
        float avg = 0, geomAvg = 1;
        for (int i = 0; i < 6; i++) {
            avg += Task1_4.getDigit(N, i) / 6.;
            geomAvg *= Math.pow(Task1_4.getDigit(N, i), 1/6.);
        }
        System.out.printf("среднее арифметическое: %f\nсреднее геометрическое: %f", avg, geomAvg);
    }
}
