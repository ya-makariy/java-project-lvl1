package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static final String RULES = "What number is missing in the progression?";

    public static void progression() {
        String[][] qna = new String[Engine.getPlayTimes()][2];
        final int maxStartValue = 100;
        final int maxStep = 20;
        final int maxPlusSize = 10;
        for (int i = 0; i < Engine.getPlayTimes(); i++) {
            int rowLength = maxPlusSize / 2 + Engine.randomize(maxPlusSize);
            int step = 1 - maxStep / 2 + Engine.randomize(maxStep);
            int startValue = -maxStartValue / 2 + Engine.randomize(maxStartValue);
            int randomNumber = Engine.randomize(rowLength);
            int[] progressionArray = buildProgression(startValue, step, rowLength);
            qna[i][1] = String.valueOf(progressionArray[randomNumber]);
            qna[i][0] = buildQuestion(progressionArray, randomNumber);
        }
        Engine.fullGame(RULES, qna);
    }

    public static int[] buildProgression(int startValue, int step, int rowLength) {
        int[] progressionArray = new int[rowLength];
        progressionArray[0] = startValue;
        for (int i = 1; i < rowLength; i++) {
            progressionArray[i] = progressionArray[i - 1] + step;
        }
        return progressionArray;
    }

    public static String buildQuestion(int[] progressionArray, int randomNumber) {
        String question = String.valueOf(progressionArray[0]);
        for (int i = 1; i < progressionArray.length; i++) {
            if (i == randomNumber) {
                question = String.join(" ", question, "..");
            } else {
                question = String.join(" ", question, String.valueOf(progressionArray[i]));
            }
        }
        return question;
    }
}
