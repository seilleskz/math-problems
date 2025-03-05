import java.util.*;

public class MathProblems {
    public static int[] getRandomArray(int n) {
        Random rand = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(10);
        }
        return array;
    }
}
