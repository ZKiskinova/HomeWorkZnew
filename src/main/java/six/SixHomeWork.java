package six;

import java.util.Scanner;

public class SixHomeWork {
    public static void main(String[] args) {

        String password;
        Scanner input = new Scanner(System.in);
        System.out.println("Please fill up your username:");
        input.nextLine();
        System.out.println("Please fill up your password:");
        password = input.nextLine();

        if (password.matches("^(?=.[0-9])(?=.[a-z])(?=.[A-Z])(?=.[@#$%^&+=])(?=\\S+$).{8,}$")) {

            System.out.println("Your password is correct");
        }else{
            System.out.println("Your password have to have be minimum 8 symbols, with capital letter, number, and special symbol");
        }


    }
}







