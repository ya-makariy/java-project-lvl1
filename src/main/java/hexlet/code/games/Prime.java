package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void prime() {
        Engine.gameGreeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        final int maxNumber = 100;
        for (int i = 0; i < Engine.getPlayTimes(); i++) {
            int question = 1 + Engine.randomize(maxNumber);
            String correctAnswer = isPrime(question);
            String answer = Engine.question(String.valueOf(question));
            if (Engine.isCorrect(correctAnswer, answer)) {
                return;
            }
        }
        Engine.grats();
    }

    public static String isPrime(int question) {
        for (int j = 2; j < question / 2; j++) {
            if (question % j == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
