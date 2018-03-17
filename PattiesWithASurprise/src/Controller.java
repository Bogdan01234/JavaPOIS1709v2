// Программа, симулятор пирожков с "сюрпризом", версия 1.0
//Лапатнёв Богдан Александрович, группа pois1709v2. 17.03.2018
public class Controller {

    public static void main(String[] args) {

        int numbPatty = RandomPatty.getPatty();
        View.print("Your surprise: " + Surprises.getSurprises(numbPatty));

    }
}
