package fouth;

public class FourthHomeWork {

    public static void main(String[] args) {
        int[] defaultValues = new int[20];
        int i = 0;

        /// Task 1
        while (i < defaultValues.length) {
            defaultValues[i] = i * 5;
            System.out.println("The product of index " + i + " and integer 5 is: " + i * 5);
            i++;

        }
        System.out.println(".............................");

        ///// Task 2
        float sum = 0;
        i = 0;

        float avarageValue = 0;
        do {
            sum += defaultValues[i];
            i++;

        } while (i < 19);

        avarageValue = (sum / defaultValues.length);

        System.out.printf("Avarage value of all indexes is: %f\n", avarageValue);

        System.out.println("....................................");

        //// Task 3

        float sumEven = 0;
        float sumOdd = 0;

        while (i < 19) {
            if (defaultValues[i] % 2 == 0) {
                sumEven += defaultValues[i];
                i++;
            }
        }
        System.out.printf(" value is : %f\n", sumEven);
    }
    }







