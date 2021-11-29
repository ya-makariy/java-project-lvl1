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
    public static void gameGreeting() {
        System.out.print("""

                Welcome to the Brain Games!
                May I have your name?\s""");
        setPlayerName();
        System.out.println("Hello, " + getPlayerName() + "!");
    }

    public static String scanValue() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    public static void grats() {
        System.out.println("Congratulations, " + getPlayerName() + "!");
    }

    public static String question(String questionValue) {
        System.out.print("Question: " + questionValue
                + "\nYour answer: ");
        return Engine.scanValue();
    }

    public static boolean isCorrect(String correctAnswer, String answer) {
        if (correctAnswer.equals(answer)) {
            System.out.println("Correct!");
            return false;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.\n"
                    + "Let's try again, " + getPlayerName() + "!");
            return true;
        }
    }

    public static int randomize(int number) {
        Random random = new Random();
        return random.nextInt(number);
    }

    public static void fullGame(String rules, String[][] qna) {
        gameGreeting();
        System.out.println(rules);
        for (int i = 0; i < getPlayTimes(); i++) {
            String answer = question(qna[i][0]);
            if (isCorrect(qna[i][1], answer)) {
                return;
            }
        }
        grats();
    }
}
