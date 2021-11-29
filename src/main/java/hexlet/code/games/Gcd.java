package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    public static void gcd() {
        String rules = "Find the greatest common divisor of given numbers.";
        Engine.fullGame(rules, generateValues());
    }

    public static String[][] generateValues() {
        String[][] qna = new String[Engine.getPlayTimes()][2];
        final int maxRandomValue = 100;
        for (int i = 0; i < Engine.getPlayTimes(); i++) {
            int numberA = 1 + Engine.randomize(maxRandomValue);
            int numberB = 1 + Engine.randomize(maxRandomValue);
            qna[i][0] = numberA + " " + numberB;
            qna[i][1] = maxgcd(numberA, numberB);
        }
        return qna;
    }

    public static String maxgcd(int numberA, int numberB) {
        String correctAnswer = "1";
        for (int j = 2; j <= Math.min(numberA, numberB); j++) {
            if ((numberA % j == 0) && (numberB % j == 0)) {
                correctAnswer = String.valueOf(j);
            }
        }
        return correctAnswer;
    }
}
