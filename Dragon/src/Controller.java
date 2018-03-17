// Программа для подсчёта голов и глаз дракона, с учётом его возраста, версия 1.0
//Лапатнёв Богдан Александрович, группа pois1709v2.

public class Controller {

    public static void main(String[] args) {
        View.print("This program counts how many heads and eyes the dragon has\n");

        int age = UserInout.input("Input age: ");

        String result = HeadCounter.counter(age);

        View.print("\n" + result + "\n");
    }
}
