package org.example;

import java.util.Scanner;

public class MyFirstHomeWork {
    public static void main(String[] args) {

         System.out.println("Wellcome in Zizu.com");

        Scanner scanner = new Scanner(System.in) ;

                System.out.println("Please enter your name:");

        String userName = scanner.nextLine() ;

                System.out.println("Nice to meet you" +  userName);

                System.out.println("Please enter your hobby:");

                String userHobby = scanner.nextLine();

                System.out.println("Thank you"   +  userName +". That information is very important for Zizu.com");
    }
}
