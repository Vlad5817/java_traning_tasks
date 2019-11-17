public class Task1_3 {
    static float circleSquare(float radius)
    {
        return (float) (Math.PI * radius * radius);
    }
    public static void main(String args[])
    {
        float R1 = 50, R2 = 35;
        System.out.print(R1 > R2 ? circleSquare(R1)-circleSquare(R2) : 0);
    }
}
