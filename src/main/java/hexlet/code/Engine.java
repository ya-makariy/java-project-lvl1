package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int playTimes = 3;


    public static String setPlayerName() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    public static void fullGame(String rules, String[][] qna) {
        System.out.print("""

                Welcome to the Brain Games!
                May I have your name?\s""");
        String playerName = setPlayerName();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(rules);
        for (int i = 0; i < playTimes; i++) {

            System.out.print("Question: " + qna[i][0]
                    + "\nYour answer: ");
            Scanner scan = new Scanner(System.in);
            String answer = scan.next();

            if (qna[i][1].equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + qna[i][1] + "'.\n"
                        + "Let's try again, " + playerName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + playerName + "!");    }
}
