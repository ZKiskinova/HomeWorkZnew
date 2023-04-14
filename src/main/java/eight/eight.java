package eight;

public class eight {
    public eight() {
    }

    public static void main(String[] args) {

        int a = 56;
        int b = 78;
        int c = 12;

      //// Task 1
        Math.max(Math.max(a, b), c);
        System.out.println("The largest number of 56,78 and 12 is:" + Math.max(Math.max(a, b), c));

        System.out.println("..................................");

        /////Task 2

        System.out.println("If a = 56m and b = 78m are cathetus of rectangular triangle. The  area of that triangle is:" + (Math.multiplyExact(a,b)*0.5) + "sq.m");

        System.out.println(".....................................");


    }

    }

