package eight;

import java.util.Random;

public class randomEight {
    public static void main(String[] args) {

        ////Task 3

         Random a = new Random();
         int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = a.nextInt(100);
            System.out.print(array[i] + " ");
        }
    }
}
