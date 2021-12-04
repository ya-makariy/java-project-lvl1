package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    public static void gcd() {
        String[][] qna = new String[Engine.getPlayTimes()][2];
        final int maxRandomValue = 100;
        for (int i = 0; i < Engine.getPlayTimes(); i++) {
            int numberA = 1 + Engine.randomize(maxRandomValue);
            int numberB = 1 + Engine.randomize(maxRandomValue);
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
