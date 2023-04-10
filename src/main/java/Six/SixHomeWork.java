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

            if ((password.length() < 8) ||(password.length() > 8))
                System.out.println("Password have to be 8 charapters");

            else;
            if (!(password.contains("!")) || !(password.contains(".")) || !(password.contains("?")))
                System.out.println("Password have to have one of those symbols: !, . , ?");

            else;
            if(!(password.contains("([A-Z])")))
                System.out.println("Password have to have one alphabetik");

            else;
            if(!(password.contains("([0-9])")))
                System.out.println("Password have to have one numbers");

            else;
        System.out.println("Your password was acceptable!");
            }

}






