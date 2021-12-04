package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    public static void main(String[] args) {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");
        String gameNum = Engine.scanValue();
        switch (gameNum) {
            case ("1"):
                Cli.cli();
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
            case ("5"):
                Progression.progression();
                break;
            case ("6"):
                Prime.prime();
                break;
            case ("0"):
                break;
            default:
                System.out.print("Sorry I don't know this kind of game, please make choice again: ");
                break;
        }
    }
}
