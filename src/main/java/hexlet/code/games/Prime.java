package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void prime() {
        final int maxNumber = 100;
        String[][] qna = new String[Engine.getPlayTimes()][2];
        for (int i = 0; i < Engine.getPlayTimes(); i++) {
            int question = 1 + Engine.randomize(maxNumber);
            qna[i][0] = String.valueOf(question);
            qna[i][1] = isPrime(question) ? "yes": "no";
        }
        Engine.fullGame(RULES, qna);
    }

    public static boolean isPrime(int question) {
        for (int i = 2; i < question / 2; i++) {
            if (question % i == 0) {
                return false;
            }
        }
        return true;
    }
}
