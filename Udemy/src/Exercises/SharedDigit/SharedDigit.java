package Exercises.SharedDigit;

public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2) {

        int number1First, number1Last, number2First, number2Last;

        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {

            return false;
        }

        number1Last = number1 % 10;
        number1First = number1 / 10;

        number2Last = number2 % 10;
        number2First = number2 / 10;

        if (number1Last == number2Last || number1Last == number2First ||
                number1First == number2First || number1First == number2Last) {
            return true;

        }
        return false;


    }
}
