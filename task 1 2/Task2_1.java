class Vector2D {
    public double x = 0, y = 0;

    public Vector2D(double x, double y)
    {
        this.x = x; this.y = y;
    }
    public Vector2D substract(Vector2D vec)
    {
        return new Vector2D(x - vec.x, y - vec.y);
    }
    public double dot(Vector2D vec)
    {
        return x * vec.x + y * vec.y;
    }
}

public class task2_1 {
    public static void main(String[] args) {
        Vector2D point1 = new Vector2D(3, 2),
                point2 = new Vector2D(0, 1),
                point3 = new Vector2D( 2, 0),
                v1 = point1.substract(point2),
                v2 = point1.substract(point3),
                v3 = point2.substract(point3);
        if(v1.x * v2.y - v1.y * v2.x == 0)
        {
            System.out.print("треугольник не существует");
        } else if (v1.dot(v2) == 0 || v1.dot(v3) == 0 || v2.dot(v3) == 0)
            System.out.print("треугольник прямоугольный");
        else
            System.out.print("треугольник существует");
    }
}
