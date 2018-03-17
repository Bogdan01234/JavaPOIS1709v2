public class MoodDefinition {

    public static String getMood(int data) {

        String mood;
        switch (data){
            case 0: mood = " :) ";
                return mood;
            case 1: mood = " :( ";
                return mood;
            case 2: mood = " :| ";
                return mood;
            case 3: mood = " ^_^ ";
                return mood;
            default: mood = " :3 ";
                return mood;
        }
    }
}
