package hexlet.code;

import java.util.Random;

public class Utils {
    public static final int maxRandomValue = 20;


    public static int randomize(int number) {
        Random random = new Random();
        return random.nextInt(number);
    }
}
