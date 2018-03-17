import java.util.Random;

public class RandomPatty {

    private static Random random = new Random();

    public static int getPatty() {
        int patty = random.nextInt(5);
        return patty;
    }
}
