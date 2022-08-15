package Exercises.isEvenNumber;

public class Main {
    public static boolean isEvenNumber(int number) {
        int count = 0;
        for (int i = number; i < 100; i++) {
            if (number % 2 == 0) {
                return true;

            }

        }
        return false;
    }

    public static void main(String[] args) {
       /*
        int number = 4;
        int finishNumber = 20;
        while (number <= finishNumber) {

            number++;
            if (!Exercises.isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
        }
        */
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while (number <= finishNumber) {

            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            evenNumbersFound++;
            if (evenNumbersFound==5){
                break;
            }
            System.out.println("Even number " + number);


        }
        System.out.println("Totan even numbers found: " + evenNumbersFound);
    }
}
