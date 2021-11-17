package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

public class Progression {

    public static void progression() {
        Engine.gameGreeting();
        System.out.println("What number is missing in the progression?");

        final int maxStartValue = 100;
        final int maxStep = 20;
        final int maxPlusSize = 10;

        for (int i = 0; i < Engine.getPlayTimes(); i++) {
            String[] row = new String[maxPlusSize / 2 + Engine.randomize(maxPlusSize)];
            int step = 1 - maxStep / 2 + Engine.randomize(maxStep);
            int startValue = -maxStartValue / 2 + Engine.randomize(maxStartValue);

            for (int j = 0; j < row.length; j++) {
                startValue = startValue + step;
                row[j] = String.valueOf(startValue);
            }

            int randomNumber = Engine.randomize(row.length);
            String correctAnswer = row[randomNumber];
            row[randomNumber] = "..";

            String answer = Engine.question(Arrays.deepToString(row));

            if (Engine.isCorrect(correctAnswer, answer)) {
                return;
            }
        }

        Engine.grats();
    }
}
