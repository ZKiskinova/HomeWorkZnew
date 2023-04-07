package fouth;

import java.util.Scanner;

public class TaskSix {

    public static void main(String[] args) {
        int n = 0;
        System.out.println("Please, enter how many numbers of Fibonacci you want to print:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int first = 0;
        int second = 1;
        for (int i = 1; i <= n ; i++) {
            int next = first + second;
            System.out.printf(first + " ");
            first = second;
            second = next;
        }
        System.out.println("The sum of is:" + sumFibonacci(n));

    }
    public static int sumFibonacci(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        for (int i = 1; i <=n ; i++) {
            first = second;
            second = next;
            int next = first + second;

        }
        return sumFibonacci(n-1) + sumFibonacci(n-2);

    }


}




