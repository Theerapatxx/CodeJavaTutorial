import java.util.Scanner;
public class IfAct {
    public static void main(String[] args) {
        double score;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter score: ");
        score = in.nextDouble();
        if(score > 60)
            System.out.println("you are pass");
        else 
            System.out.println("you are not pass");
    }
}
