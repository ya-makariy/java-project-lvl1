package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void even() {
        String[][] qna = new String[Engine.PLAYTIMES][2];
        for (int i = 0; i < Engine.PLAYTIMES; i++) {
            int number = 1 + Utils.randomize(Utils.MAXRANDOMVALUE);
            qna[i][0] = String.valueOf(number);
            qna[i][1] = number % 2 == 0 ? "yes" : "no";
        }

        Engine.fullGame(RULES, qna);
    }
}
