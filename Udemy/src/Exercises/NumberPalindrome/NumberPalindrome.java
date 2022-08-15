package Exercises.NumberPalindrome;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int testNumber = number;

        while (testNumber != 0) {
            int lastDigit = testNumber % 10;
            reverse = (reverse * 10) + lastDigit;
            testNumber /= 10;

        }

        if (reverse == number) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }

    }

    public static void main(String[] args) {
        isPalindrome(21);
    }
}
