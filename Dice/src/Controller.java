// Программа эмуляции игры в кости, версия 1.0
//Лапатнёв Богдан Александрович, группа pois1709v2.

public class Controller {

    public static void main(String[] args) {
        int dice1 = Dice.diceRoll();
        int dice2 = Dice.diceRoll();
        int amounr = Amount.getAmount(dice1,dice2);
        View.print("The result of throwing the first dice: " + dice1);
        View.print("\nThe result of throwing the second dice: " + dice2);
        View.print("\nTotal Points: " + amounr);
    }
}
