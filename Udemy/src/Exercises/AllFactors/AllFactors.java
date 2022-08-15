package Exercises.AllFactors;

import java.util.Scanner;

public class AllFactors {
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            } else {
                continue;
            }

        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give a number: ");
        int num = in.nextInt();
        in.close();
        printFactors(num);
    }

}
