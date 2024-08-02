public class Ex5_2 {
    public static int sum(int x) {
        return x * x * x;
    }
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            int result = sum(x);
            System.out.println("The value of " + x + " cubed is: " + result);
        }
    }
}
