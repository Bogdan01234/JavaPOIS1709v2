public class Controller {

    public static void main(String[] args) {

        String moon = MoodDefinition.getMood(RandomNumber.getNumber());

        View.print("Your mood now: \n " + moon);
    }
}
