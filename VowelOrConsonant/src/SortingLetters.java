public class SortingLetters {

    public static String getResult(String letter) {
        String msg;
        if (letter.matches("^(?i:[aeiouy]).*")){ // letter.matches("^(?ui:[аеёиоуыэюя]).*") для кириллицы.
            msg = "Letter \" " + letter + "\" of vowel.";
        } else {
            msg = "Letter \"" + letter + "\" consonant.";
        }
        return msg;
    }
}
