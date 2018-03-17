import java.util.Scanner;

public class UserInout {

    private static Scanner scanner = new Scanner(System.in);

    public static String input(String msg){
        System.out.println(msg);
        return scanner.nextLine();
    }
}
