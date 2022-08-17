package Exercises.SumCalculator;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        double sum;

        sum = getFirstNumber() + getSecondNumber();

        return sum;
    }


    public double getSubtractionResult() {
        double difference;

        difference = getFirstNumber() - getSecondNumber();

        return difference;
    }

    public double getMultiplicationResult() {
        double product;

        product = getFirstNumber() * getSecondNumber();

        return product;
    }

    public double getDivisionResult() {
        double quotient;
        if(getSecondNumber() == 0) {
            quotient = 0.0;
            System.out.println("\n(NOTE: Dividing by 0 typically yields an invalid result.)");
        }
        else

            quotient = getFirstNumber() / getSecondNumber();

        return quotient;
    }
}
