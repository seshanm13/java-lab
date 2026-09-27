public class Main {

    // Square
    static void square(double side) {
        double area = side * side;
        double perimeter = 4 * side;

        System.out.println("Square Area = " + area);
        System.out.println("Square Perimeter = " + perimeter);
    }

    // Rectangle
    static void rectangle(double length, double breadth) {
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        System.out.println("Rectangle Area = " + area);
        System.out.println("Rectangle Perimeter = " + perimeter);
    }

    // Triangle
    static void triangle(double base, double height, double a, double b, double c) {
        double area = 0.5 * base * height;
        double perimeter = a + b + c;

        System.out.println("Triangle Area = " + area);
        System.out.println("Triangle Perimeter = " + perimeter);
    }

    // Circle
    static void circle(double radius) {
        double area = 3.14 * radius * radius;
        double perimeter = 2 * 3.14 * radius;

        System.out.println("Circle Area = " + area);
        System.out.println("Circle Perimeter = " + perimeter);
    }

    public static void main(String[] args) {

        square(5);

        rectangle(6, 4);

        triangle(4, 5, 4, 5, 6);

        circle(3);
    }
}

    