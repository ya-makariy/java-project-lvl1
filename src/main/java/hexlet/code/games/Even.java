package hexlet.code.games;

import hexlet.code.Cli;
import java.util.Random;

public class Even {
    public static void even() {
        //Cli.greeter();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String playerName = Cli.scanValue();
        System.out.println("Hello, " + playerName + "!"
                + "\nAnswer 'yes' if the number is even, otherwise answer 'no'.");
        final int playTimes = 3;
        final int maxRandomValue = 100;

        for (int i = 0; i < playTimes; i++) {
            Random random = new Random();
            int number = 1 + random.nextInt(maxRandomValue);
            System.out.print("Question: " + number
                    + "\nYour answer: ");
            String answer = Cli.scanValue();

            if (((number % 2 == 0) && (answer.equals("yes"))) || ((!(number % 2 == 0) && (answer.equals("no"))))) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!\nYou lose!");
                break;
            }
        }
        System.out.println("Congratulations, " + playerName + "!");
    }
}
