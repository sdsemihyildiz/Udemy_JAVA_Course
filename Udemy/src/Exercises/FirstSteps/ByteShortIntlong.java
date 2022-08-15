package Exercises.FirstSteps;

public class ByteShortIntlong {
    public static void main(String[] args) {

        int myMaxIntValue = Integer.MAX_VALUE;
        int myMinIntValue = Integer.MIN_VALUE;
        System.out.println("Int Max: " + myMaxIntValue);
        System.out.println("Int Min: " + myMinIntValue);
        System.out.println("Busted max value: " + (myMaxIntValue + 1)); //overflow
        System.out.println("Busted min value: " + (myMinIntValue - 1)); //underflow

        System.out.println("---------");

        byte myMaxByteValue = Byte.MAX_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;
        System.out.println("Byte Max: " + myMaxByteValue);
        System.out.println("Byte Min: " + myMinByteValue);

        System.out.println("---------");

        short myMaxShortValue = Short.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;
        System.out.println("Short Max: " + myMaxShortValue);
        System.out.println("Short Min: " + myMinShortValue);

        System.out.println("---------");

        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("Long Max: " + myMaxLongValue);
        System.out.println("Long Min: " + myMinLongValue);

        byte myNewByte = (byte) (myMaxByteValue/2); //without (byte) it gives error









    }
}
