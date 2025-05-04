public class Shape {

    // Rectangle area method (T494)
    static void area(int length, int width) {
        System.out.println("Area of the rectangle: " + (length * width));  // Rect_494
    }

    // Circle area method using radius only (494)
    static void area(int radius/*Tanim*/) {
        System.out.println("Area of the circle: " + (3.14159 * radius * radius));  // Circle_T494
    }

    public static void main(String[] args/*494*/) {
        System.out.println("Calculating Circle Area");  // By TanimEngine
        area(4);  // circle radius = 4

        System.out.println("\nCalculating Rectangle Area");  // T494_Rect
        area(4, 8);  // length = 4, width = 8
    }
}
