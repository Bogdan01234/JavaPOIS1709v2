// Программа для определения является ли введённая буква гласной либо согласной, версия 1.0
//Лапатнёв Богдан Александрович, группа pois1709v2.

public class Controller {

    public static void main(String[] args) {

        String letter = UserInout.input("Enter the letter: ");
        View.print(SortingLetters.getResult(letter));
    }
}
