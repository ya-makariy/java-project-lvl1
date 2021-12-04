package hexlet.code;

import static hexlet.code.Engine.getPlayerName;
import static hexlet.code.Engine.setPlayerName;

public class Cli {
    public static void cli() {
        System.out.print("""

                Welcome to the Brain Games!
                May I have your name?\s""");
        setPlayerName();
        System.out.println("Hello, " + getPlayerName() + "!");
    }
}
