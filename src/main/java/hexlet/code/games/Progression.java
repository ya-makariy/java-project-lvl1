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
            String correctAnswer = "";
            StringBuilder question = new StringBuilder();
            for (int j = 0; j < rowLength; j++) {
                startValue = startValue + step;
                if (j == randomNumber) {
                    correctAnswer = String.valueOf(startValue);
                    question.append(".. ");
                } else {
                    question.append(startValue).append(" ");
                }
            }
            String answer = Engine.question(question.toString());
            if (Engine.isCorrect(correctAnswer, answer)) {
                return;
            }
        }
        Engine.grats();
    }
}
