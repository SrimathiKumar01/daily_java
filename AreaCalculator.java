public class AreaCalculator {

    // Method to calculate the area of a rectangle
    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    // Method to calculate the area of a circle
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a triangle
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        // Rectangle
        double rectangleWidth = 5.0;
        double rectangleHeight = 10.0;
        double rectangleArea = calculateRectangleArea(rectangleWidth, rectangleHeight);
        System.out.println("Area of the rectangle: " + rectangleArea);

        // Circle
        double circleRadius = 7.0;
        double circleArea = calculateCircleArea(circleRadius);
        System.out.println("Area of the circle: " + circleArea);

        // Triangle
        double triangleBase = 8.0;
        double triangleHeight = 6.0;
        double triangleArea = calculateTriangleArea(triangleBase, triangleHeight);
        System.out.println("Area of the triangle: " + triangleArea);
    }
}
