package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void calc() {
        Engine.gameGreeting();
        System.out.println("What is the result of the expression?");

        final int maxRandomValue = 20;
        final String symbols = "+-*";
        for (int i = 0; i < Engine.getPlayTimes(); i++) {
            int numberA = 1 + Engine.randomize(maxRandomValue);
            int numberB = 1 + Engine.randomize(maxRandomValue);
            char symbol = symbols.charAt(Engine.randomize(symbols.length()));
            int correctAnswer = result(numberA, numberB, symbol);
            //if (symbol == '*') {
            //    result = numberA * numberB;
            //} else if (symbol == '+') {
            //    result = numberA + numberB;
            //} else {
            //    result = numberA - numberB;
            //}
            String question = String.valueOf(numberA) + symbol + numberB;
            String answer = Engine.question(question);
            if (Engine.isCorrect(String.valueOf(correctAnswer), answer)) {
                return;
            }
        }
        Engine.grats();
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
