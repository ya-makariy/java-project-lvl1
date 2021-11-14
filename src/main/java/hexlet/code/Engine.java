package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String playerName;

    public static void setPlayerName() {
        playerName = scanValue();
    }

    public static String getPlayerName() {
        return playerName;
    }

    public static void gameGreeting() {
        System.out.print("Welcome to the Brain Games!"
                + "\nMay I have your name? ");
        setPlayerName();
        System.out.println("Hello, " + playerName + "!");
    }

    public static String scanValue() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }
}
