package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void even() {
        final int maxRandomValue = 100;
        String[][] qna = new String[Engine.getPlayTimes()][2];
        for (int i = 0; i < Engine.getPlayTimes(); i++) {
            int number = 1 + Engine.randomize(maxRandomValue);
            qna[i][0] = String.valueOf(number);
            qna[i][1] = number % 2 == 0 ? "yes" : "no";
        }

        Engine.fullGame(RULES, qna);
    }
}
