package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    public static void progression() {
        String rules = "What number is missing in the progression?";
        Engine.fullGame(rules, generateValues());
    }

    public static String[][] generateValues() {
        String[][] qna = new String[Engine.getPlayTimes()][2];
        final int maxStartValue = 100;
        final int maxStep = 20;
        final int maxPlusSize = 10;
        for (int i = 0; i < Engine.getPlayTimes(); i++) {
            int rowLength = valueLength(maxPlusSize);
            int step = 1 + value(maxStep);
            int startValue = value(maxStartValue);
            int randomNumber = Engine.randomize(rowLength);
            qna[i] = questionAnswer(rowLength, startValue, step, randomNumber);
        }
        return qna;
    }

    public static int valueLength(int max) {
        return (max / 2 + Engine.randomize(max));
    }

    public static int value(int max) {
        return (-max / 2 + Engine.randomize(max));
    }

    public static String[] questionAnswer(int rowLength, int startValue, int step, int randomNumber) {
        String[] qna = new String[2];
        qna[0] = "";
        for (int j = 0; j < rowLength; j++) {
            startValue = startValue + step;
            if (j == randomNumber) {
                qna[1] = String.valueOf(startValue);
                qna[0] = qna[0] + ".. ";
            } else {
                qna[0] = qna[0] + startValue + " ";
            }
        }
        qna[0] = qna[0].substring(0, qna[0].length() - 1);
        return qna;
    }
}
