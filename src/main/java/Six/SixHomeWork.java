package Six;

import java.util.Scanner;

public class SixHomeWork {
    public static void main(String[] args) {

        String password;
        Scanner input = new Scanner(System.in);
        System.out.println("Please fill up your username:");
        input.nextLine();
        System.out.println("Please fill up your password:");
        password = input.nextLine();

        if (password.length() < 8) {
            System.out.println("Password have to be 8 symbols");
        }

        if (!((password.contains("!")) || (password.contains(".")) || (password.contains("?")))) {
            System.out.println("Password have to have one of those symbols: !, . , ?");
        }

        if ((password.matches("[^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$]"))) {
            System.out.println("Password have to have  alphabetik");
        }

        System.out.println("I am happy");
    }

}






