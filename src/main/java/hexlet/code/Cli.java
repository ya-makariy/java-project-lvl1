package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Even;

public class Cli {

    public static void greeter() {
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        String playerName = scanValue();
        System.out.println("Hello, " + playerName + "!");
    }

    public static void choice() {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit
                Your choice:\s""");
        String gameNum = scanValue();
        switch (gameNum) {
            case ("1"):
                greeter();
                break;
            case ("2"):
                Even.even();
                break;
            case ("0"):
                break;
            default:
                System.out.println("Sorry I don't know this kind of game");
                choice();
        }
    }

    public static String scanValue() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

}
