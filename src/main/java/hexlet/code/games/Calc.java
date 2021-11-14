package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void calc() {
        Engine.gameGreeting();
        System.out.println("What is the result of the expression?");

        final int playTimes = 3;
        final int maxRandomValue = 100;

        for (int i = 0; i < playTimes; i++) {
            Random random = new Random();
            int numberA = 1 + random.nextInt(maxRandomValue);
            int numberB = 1 + random.nextInt(maxRandomValue);
            String symbols = "+-*";
            char symbol = symbols.charAt(random.nextInt(symbols.length()));
            Integer result;

            switch (symbol) {
                case ('*') -> result = numberA * numberB;
                case ('+') -> result = numberA + numberB;
                case ('-') -> result = numberA - numberB;
                default -> result = 0;
            }
            System.out.print("Question: " + numberA + symbol + numberB
                    + "\nYour answer: ");
            String answer = Engine.scanValue();

            if (result.equals(Integer.valueOf(answer))) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!\nYou lose!");
                return;
            }
        }

        Engine.grats();

    }

    //public static String random() {

    //}
}
