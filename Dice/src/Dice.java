import java.util.Random;

public class Dice {

    private static Random random = new Random();

    public static int diceRoll() {
        int number = random.nextInt(6) + 1;
        return number;
    }
}
