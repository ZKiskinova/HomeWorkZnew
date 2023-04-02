package fouth;

public class Taskthree {
    public static void main(String[] args) {

        /// Task 3
        int newValues[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < newValues.length; i++){

            if (newValues[i] % 2 == 0){
                evenSum = evenSum + newValues[i];
            }
        }
        System.out.println(" The sum of all even intigers is:" + evenSum);

        for (int i = 0; i < newValues.length; i++){

            if (newValues[i] % 2 == 1){
                oddSum = oddSum + newValues[i];
            }
        }
        System.out.println( " The sum of all odd intigers is: " + oddSum);



    }

}

