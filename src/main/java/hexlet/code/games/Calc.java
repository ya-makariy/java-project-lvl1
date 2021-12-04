package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static final String RULES = "What is the result of the expression?";
    static final String[] SYMBOLS = new String[]{"+", "-", "*"};

    public static void calc() {
        String[][] qna = new String[Engine.getPlayTimes()][2];
        final int maxRandomValue = 20;
        for (int i = 0; i < Engine.getPlayTimes(); i++) {
            int numberA = 1 + Engine.randomize(maxRandomValue);
            int numberB = 1 + Engine.randomize(maxRandomValue);
            String symbol = SYMBOLS[Engine.randomize(SYMBOLS.length)];
            switch (symbol) {
                case ("+"):
                    qna[i][1] = String.valueOf(numberA + numberB);
                    break;
                case ("-"):
                    qna[i][1] = String.valueOf(numberA - numberB);
                    break;
                default:
                    qna[i][1] = String.valueOf(numberA * numberB);
                    break;
            }
            qna[i][0] = numberA + " " + symbol + " " + numberB;
        }
        Engine.fullGame(RULES, qna);
    }
}
