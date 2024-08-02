import java.util.Scanner;

public class Ex5_4 {
    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "The number " + number + " is even."; 
        } else {
            return "The number " + number + " is odd.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String result = checkEvenOrOdd(number);
        System.out.println(result);

    }
}
