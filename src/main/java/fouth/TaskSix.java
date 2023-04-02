package fouth;

public class TaskSix {
    public static void main(String[] args) {

        int[] Fibonaci = new int[20];
        int x = 450;
        int first = 0;
        int second = 1;
        int next = first + second;
        int sum = 0;
        int i = 0;
        int n = 5;

        while (first <=450 && i<=n){
            Fibonaci[i] =
            next = first + second;
            first = second;
            second = next;
            sum = (sum + Fibonaci[i]);
            System.out.printf("The sum is : %s", sum);
        }
        }

    }


