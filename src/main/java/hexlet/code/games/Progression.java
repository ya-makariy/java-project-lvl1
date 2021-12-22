package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final String RULES = "What number is missing in the progression?";
    private static final int MAXSTARTVALUE = 100;
    private static final int MAXSTEP = 20;
    private static final int MAXPLUSSIZE = 10;

    public static void progression() {
        String[][] qna = new String[Engine.PLAYTIMES][2];
        for (int i = 0; i < Engine.PLAYTIMES; i++) {
            int rowLength = MAXPLUSSIZE / 2 + Utils.randomize(MAXPLUSSIZE);
            int step = 1 - MAXSTEP / 2 + Utils.randomize(MAXSTEP);
            int startValue = -MAXSTARTVALUE / 2 + Utils.randomize(MAXSTARTVALUE);
            int hiddenElementIndex = Utils.randomize(rowLength);
            int[] progression = buildProgression(startValue, step, rowLength);
            qna[i][1] = String.valueOf(progression[hiddenElementIndex]);
            qna[i][0] = buildQuestion(progression, hiddenElementIndex);
        }
        Engine.fullGame(RULES, qna);
    }

    public static int[] buildProgression(int startValue, int step, int rowLength) {
        int[] progression = new int[rowLength];
        progression[0] = startValue;
        for (int i = 1; i < rowLength; i++) {
            progression[i] = progression[i - 1] + step;
        }
        return progression;
    }

    public static String buildQuestion(int[] progression, int hiddenElementIndex) {
        String question = String.valueOf(progression[0]);
        for (int i = 1; i < progression.length; i++) {
            if (i == hiddenElementIndex) {
                question = String.join(" ", question, "..");
            } else {
                question = String.join(" ", question, String.valueOf(progression[i]));
            }
        }
        return question;
    }
}
