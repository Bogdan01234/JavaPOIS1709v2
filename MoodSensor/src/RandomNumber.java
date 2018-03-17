import java.util.Random;

public class RandomNumber {

        private static Random random = new Random();

        public static int getNumber() {
            int number = random.nextInt(5);
            return number;
    }
}
