package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String RULES = "What is the result of the expression?";
    static final String[] SYMBOLS = new String[]{"+", "-", "*"};

    public static void calc() {
        String[][] qna = new String[Engine.playTimes][2];
        for (int i = 0; i < Engine.playTimes; i++) {
            int numberA = 1 + Utils.randomize(Utils.maxRandomValue);
            int numberB = 1 + Utils.randomize(Utils.maxRandomValue);
            String symbol = SYMBOLS[Utils.randomize(SYMBOLS.length)];
            switch (symbol) {
                case ("+"):
                    qna[i][1] = String.valueOf(numberA + numberB);
                    break;
                case ("-"):
                    qna[i][1] = String.valueOf(numberA - numberB);
                    break;
                case ("*"):
                    qna[i][1] = String.valueOf(numberA * numberB);
                    break;
                default:
                    System.out.println("ERROR: don't know this symbol");
                    return;
            }
            qna[i][0] = numberA + " " + symbol + " " + numberB;
        }
        Engine.fullGame(RULES, qna);
    }
}
