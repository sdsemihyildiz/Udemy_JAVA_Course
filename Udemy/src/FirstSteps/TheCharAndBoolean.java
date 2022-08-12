package FirstSteps;

public class TheCharAndBoolean {
    public static void main(String[] args) {

        char myChar = 'D';
        char myUnicodechar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodechar);
        char mySecondChar = '\u00A9';
        System.out.println(mySecondChar);

        boolean myBooleanTrue = Boolean.TRUE;
        boolean myBooleanFalse = Boolean.FALSE;

        boolean isCustomer21 = true;

        boolean isAlien=true;

        if (isAlien==true){
            System.out.println("You are an alien");
        }
        else{
            System.out.println("You are not an alien");
        }
        int topScore = 99;
        if (topScore!=100){
            System.out.println("You did not got the top score");

        }else {
            System.out.println("You got the top score");
        }
        boolean isCar = false;
        boolean wasCar = isCar ? true : false;
        System.out.println(wasCar);


    }
}
