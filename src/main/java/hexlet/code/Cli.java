package hexlet.code;

//import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;

public class Cli {

    //public static void greeter() {
    //    System.out.print("Welcome to the Brain Games!\n"
    //            + "May I have your name? ");
    //    String playerName = Engine.scanValue();
    //    System.out.println("Hello, " + playerName + "!");
    //}

    public static void choice() {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                0 - Exit
                Your choice:\s""");
        String gameNum = Engine.scanValue();
        switch (gameNum) {
            case ("1"):
                Engine.gameGreeting();
                break;
            case ("2"):
                Even.even();
                break;
            case ("3"):
                Calc.calc();
                break;
            case ("4"):
                Gcd.gcd();
                break;
            case ("0"):
                break;
            default:
                System.out.println("Sorry I don't know this kind of game");
                choice();
        }
    }
}
