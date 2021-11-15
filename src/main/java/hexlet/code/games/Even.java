package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    public static void even() {
        Engine.gameGreeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        final int playTimes = 3;
        final int maxRandomValue = 100;

        for (int i = 0; i < playTimes; i++) {
            Random random = new Random();
            int number = 1 + random.nextInt(maxRandomValue);

            String answer = Engine.question(String.valueOf(number));
            String correctAnswer;
            if (number % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            //if (((number % 2 == 0) && (answer.equals("yes"))) || ((!(number % 2 == 0) && (answer.equals("no"))))) {
            //    System.out.println("Correct!");
            //} else {
            //    System.out.println("Wrong!\nYou lose!");
            //    return;
            //}
            if (Engine.isCorrect(correctAnswer, answer)) {
                return;
            }
        }
        Engine.grats();
    }
}
