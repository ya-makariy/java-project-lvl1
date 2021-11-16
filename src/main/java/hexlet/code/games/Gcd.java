package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Gcd {
    public static void gcd() {
        Engine.gameGreeting();
        System.out.println("Find the greatest common divisor of given numbers.");

        final int playTimes = 3;
        final int maxRandomValue = 100;

        for (int i = 0; i < playTimes; i++) {
            Random random = new Random();
            int numberA = 1 + random.nextInt(maxRandomValue);
            int numberB = 1 + random.nextInt(maxRandomValue);

            String question = numberA + " " + numberB;
            String answer = Engine.question(question);

            String correctAnswer = null;

            for (int j = 1; j <= Math.min(numberA, numberB); j++) {
                if ((numberA % j == 0) && (numberB % j == 0)) {
                    correctAnswer = String.valueOf(j);
                }
            }

            if (Engine.isCorrect(correctAnswer, answer)) {
                return;
            }
        }
        Engine.grats();
    }
}
