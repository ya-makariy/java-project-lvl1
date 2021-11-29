package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void calc() {
        String rules = "What is the result of the expression?";
        Engine.fullGame(rules, generateValues());
    }

    public static String[][] generateValues() {
        String[][] qna = new String[Engine.getPlayTimes()][2];
        final int maxRandomValue = 20;
        final String symbols = "+-*";
        for (int i = 0; i < Engine.getPlayTimes(); i++) {
            int numberA = 1 + Engine.randomize(maxRandomValue);
            int numberB = 1 + Engine.randomize(maxRandomValue);
            char symbol = symbols.charAt(Engine.randomize(symbols.length()));
            qna[i][1] = String.valueOf(result(numberA, numberB, symbol));
            qna[i][0] = numberA + " " + symbol + " " + numberB;
        }
        return qna;
    }


    public static int result(int numberA, int numberB, char symbol) {
        if (symbol == '*') {
            return numberA * numberB;
        } else if (symbol == '+') {
            return  numberA + numberB;
        } else {
            return numberA - numberB;
        }
    }
}
