package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    public static void gcd() {
        Engine.gameGreeting();
        System.out.println("Find the greatest common divisor of given numbers.");

        final int maxRandomValue = 100;
        for (int i = 0; i < Engine.getPlayTimes(); i++) {
            int numberA = 1 + Engine.randomize(maxRandomValue);
            int numberB = 1 + Engine.randomize(maxRandomValue);
            String question = numberA + " " + numberB;
            String answer = Engine.question(question);
            String correctAnswer = maxgcd(numberA, numberB);
            if (Engine.isCorrect(correctAnswer, answer)) {
                return;
            }
        }
        Engine.grats();
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
