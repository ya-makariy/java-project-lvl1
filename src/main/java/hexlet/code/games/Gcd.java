package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    public static void gcd() {
        String[][] qna = new String[Engine.playTimes][2];
        for (int i = 0; i < Engine.playTimes; i++) {
            int numberA = 1 + Utils.randomize(Utils.maxRandomValue);
            int numberB = 1 + Utils.randomize(Utils.maxRandomValue);
            qna[i][0] = numberA + " " + numberB;
            qna[i][1] = String.valueOf(findGcd(numberA, numberB));
        }
        Engine.fullGame(RULES, qna);
    }

    public static int findGcd(int numberA, int numberB) {
        int gcd = 1;
        for (int i = 2; i <= Math.min(numberA, numberB); i++) {
            if ((numberA % i == 0) && (numberB % i == 0)) {
                gcd = i;
            }
        }
        return gcd;
    }
}
