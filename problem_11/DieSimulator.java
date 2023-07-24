package problem_11;

import java.util.Random;

public class DieSimulator {
    public static void main(String[] args) {
        Random generator = new Random();
        int ans = generator.nextInt(6) + 1;
        System.out.println("The cast of die " + ans);
    }
}
