package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void even() {
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.fullGame(rules, generateValues());
    }

    public static String[][] generateValues() {
        final int maxRandomValue = 100;
        String[][] qna = new String[Engine.getPlayTimes()][2];
        for (int i = 0; i < Engine.getPlayTimes(); i++) {
            int number = 1 + Engine.randomize(maxRandomValue);
            qna[i][0] = String.valueOf(number);
            qna[i][1] = number % 2 == 0 ? "yes" : "no";
        }
        return qna;
    }
}
