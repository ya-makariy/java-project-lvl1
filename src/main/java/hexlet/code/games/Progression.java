package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    public static void progression() {
        Engine.gameGreeting();
        System.out.println("What number is missing in the progression?");

        final int maxStartValue = 100;
        final int maxStep = 20;
        final int maxPlusSize = 10;
        for (int i = 0; i < Engine.getPlayTimes(); i++) {
            int rowLength = maxPlusSize / 2 + Engine.randomize(maxPlusSize);
            int step = 1 - maxStep / 2 + Engine.randomize(maxStep);
            int startValue = -maxStartValue / 2 + Engine.randomize(maxStartValue);
            int randomNumber = Engine.randomize(rowLength);
            String[] qna = questionAnswer(rowLength, startValue, step, randomNumber);
            String question = qna[0];
            String correctAnswer = qna[1];
            String answer = Engine.question(question);
            if (Engine.isCorrect(correctAnswer, answer)) {
                return;
            }
        }
        Engine.grats();
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
        return qna;
    }
}
