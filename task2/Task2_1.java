class Vector2D {
    public double x = 0, y = 0;
    public Vector2D(double x, double y) {
        this.x = x; this.y = y;
    }
    public Vector2D(Vector2D start, Vector2D end) {
        x = end.x - start.x;
        y = end.y - start.y;
    }
    public double dot(Vector2D vec) {
        return x * vec.x + y * vec.y;
    }
}

public class Task2_1 {
    public static void main(String[] args) {
        Vector2D triangle[] = {
                new Vector2D(3., 2.),
                new Vector2D(0., 1.),
                new Vector2D(2., 0.),
        };
        Vector2D AB = new Vector2D(triangle[0], triangle[1]);
        Vector2D BC = new Vector2D(triangle[1], triangle[2]);
        Vector2D CA = new Vector2D(triangle[2], triangle[0]);
        if(AB.x * BC.y - AB.y * BC.x == 0) {
            System.out.println("треугольник не существует");
        } else if (AB.dot(BC) == 0 || BC.dot(CA) == 0 || CA.dot(AB) == 0)
            System.out.println("треугольник прямоугольный");
        else
            System.out.println("треугольник существует");
    }
}
