package hexlet.code;

import static hexlet.code.Engine.setPlayerName;

public class Cli {
    public static void cli() {
        System.out.print("""

                Welcome to the Brain Games!
                May I have your name?\s""");
        String playerName = setPlayerName();
        System.out.println("Hello, " + playerName + "!");
    }
}
