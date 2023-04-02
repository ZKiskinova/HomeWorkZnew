package fouth;

public class TaskFive {
    public static void main(String[] args) {
        int [] numbers = {3, 21, 45, 63, 78, 34, 567, 234, 750};
        int i = 0;

        for ( i=0; i< numbers.length; i++){

            if (numbers[i] % 3 !=0 && numbers[i] % 7 !=0){
                System.out.printf(" Integer %d can't devide by 3 and 7\n", numbers[i]);
            }
        }
    }

}

