// Программа для определения настроения польователя, версия 1.0
//Лапатнёв Богдан Александрович, группа pois1709v2.

public class Controller {

    public static void main(String[] args) {

        String moon = MoodDefinition.getMood(RandomNumber.getNumber());

        View.print("Your mood now: \n " + moon);
    }
}
