package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void calc() {
        Engine.gameGreeting();
        System.out.println("What is the result of the expression?");

        final int playTimes = 3;
        final int maxRandomValue = 20;
        final String symbols = "+-*";

        for (int i = 0; i < playTimes; i++) {
            Random random = new Random();
            int numberA = 1 + random.nextInt(maxRandomValue);
            int numberB = 1 + random.nextInt(maxRandomValue);
            char symbol = symbols.charAt(random.nextInt(symbols.length()));
            int result;

            if (symbol == '*') {
                result = numberA * numberB;
            } else if (symbol == '+') {
                result = numberA + numberB;
            } else {
                result = numberA - numberB;
            }

            String question = String.valueOf(numberA) + symbol + String.valueOf(numberB);
            String answer = Engine.question(question);

            //if (result == Integer.parseInt(answer)) {
            //    System.out.println("Correct!");
            //} else {
            //    System.out.println("Wrong!\nYou lose!");
            //    return;
            //}

            if (Engine.isCorrect(String.valueOf(result), answer)) {
                return;
            }
        }

        Engine.grats();
    }

    //public static String random() {

    //}
}
