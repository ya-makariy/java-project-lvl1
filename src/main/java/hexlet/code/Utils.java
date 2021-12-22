package hexlet.code;

import java.util.Random;

public class Utils {
    public static final int MAXRANDOMVALUE = 20;


    public static int randomize(int number) {
        Random random = new Random();
        return random.nextInt(number);
    }
}
