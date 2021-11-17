package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void even() {
        Engine.gameGreeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        final int maxRandomValue = 100;

        for (int i = 0; i < Engine.getPlayTimes(); i++) {
            int number = 1 + Engine.randomize(maxRandomValue);

            String answer = Engine.question(String.valueOf(number));
            String correctAnswer;
            if (number % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            if (Engine.isCorrect(correctAnswer, answer)) {
                return;
            }
        }
        Engine.grats();
    }
}
