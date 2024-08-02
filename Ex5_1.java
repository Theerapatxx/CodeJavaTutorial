public class Ex5_1 {
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
    public static void main(String[] args) {
        double base = 10; 
        double height = 5;
        double area = calculateTriangleArea(base, height);
        System.out.println("The area of the triangle is: " + area);
    }
}
