package Exercises.sumFirstAndLastDigit;

public class sumFirstAndLastDigit {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int first = 0;
        int last = 0;
        last = number % 10;
        while (number != 0) {
            first = number % 10;
            number /= 10;

        }
        sum = first + last;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-10));

    }
}
