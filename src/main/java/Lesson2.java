public class Lesson2 {
    public static void main(String[] args) {
        long result = plus(4, 5);

        System.out.println(result);

        System.out.println(minus(11, 8));

        System.out.println(multiply(1, 2));

        System.out.println(divide(15, 2));

        System.out.println(circleSquare(5));
    }

    public static long plus(int x, int y) {
        long z = x + y;
        return z;
    }

    public static int minus(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        return x / y;
    }

    public static double circleSquare(double radius) {
        float PI = 3.1415f;
        return PI * radius * radius;
    }
}
