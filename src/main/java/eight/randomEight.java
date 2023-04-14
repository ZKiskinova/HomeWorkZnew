package eight;

import java.util.Arrays;
import java.util.Random;

public class randomEight {
    public static void main(String[] args) {


        int [] array = new Random().ints(10,20).toArray();
        System.out.println(Arrays.toString(array));

    }
}
