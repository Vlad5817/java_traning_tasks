public class Task1_3 {
    static double ringArea(double innerRadius, double outerRadius)
    {
        assert 0 < innerRadius && innerRadius < outerRadius;
        double S1 = innerRadius * innerRadius;
        double S2 = outerRadius * outerRadius;
        return Math.PI * (S2 - S1);
    }
    public static void main(String args[])
    {
        double R1 = 50, R2 = 35;
        System.out.println(ringArea(R2, R1));
    }
}
