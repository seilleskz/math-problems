import java.util.Random;

public class MathProblems {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(10);
        int b = rand.nextInt(10);
        int c = a * b;
        System.out.println("The product of " + a + " and " + b + " is " + c);
    }
}
