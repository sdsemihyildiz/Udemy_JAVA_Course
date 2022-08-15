package Exercises.FirstSteps;

public class OperatorChallange {
    public static void main(String[] args) {
        double firstValue = 20.00;
        double secondValue = 80.00;
        double totalValue = (firstValue + secondValue) * 100d;
        System.out.println(totalValue);
        double remainder = totalValue % 40.00d;
        boolean isNoRemainder = (remainder == 0) ? true : false;
        System.out.println(isNoRemainder);
        if (!isNoRemainder){
            System.out.println("Got some remainder");
        }else {
            System.out.println("No remainder");
        }

    }
}
