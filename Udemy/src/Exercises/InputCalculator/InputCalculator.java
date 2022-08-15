package Exercises.InputCalculator;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
            counter++;
            scanner.nextLine();
        }
        long avg = Math.round((double) sum / (int) counter);
        System.out.println("SUM = " + sum + " AVG = " + avg);


    }
}
