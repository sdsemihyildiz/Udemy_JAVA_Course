package ParsingValuesFromString;

public class Main {
    public static void main(String[] args) {

        String numberAsString = "2018a";
        System.out.println("numberAsString = " + numberAsString);
        int number = Integer.parseInt(numberAsString);
        System.out.println("Number = " + number);


        numberAsString += 1;
        number += 1;
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("Number = " + number);


    }
}
