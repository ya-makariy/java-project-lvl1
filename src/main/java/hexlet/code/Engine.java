package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    private static String playerName;

    public static void setPlayerName() {
        playerName = scanValue();
    }

    public static String getPlayerName() {
        return playerName;
    }

    public static int getPlayTimes() {
        final int playTimes = 3;
        return playTimes;
    }

    public static String scanValue() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    public static int randomize(int number) {
        Random random = new Random();
        return random.nextInt(number);
    }

    public static void fullGame(String rules, String[][] qna) {
        System.out.print("""

                Welcome to the Brain Games!
                May I have your name?\s""");
        setPlayerName();
        System.out.println("Hello, " + getPlayerName() + "!");
        System.out.println(rules);
        for (int i = 0; i < getPlayTimes(); i++) {

            System.out.print("Question: " + qna[i][0]
                    + "\nYour answer: ");
            String answer = Engine.scanValue();

            if (qna[i][1].equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + qna[i][1] + "'.\n"
                        + "Let's try again, " + getPlayerName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + getPlayerName() + "!");    }
}
