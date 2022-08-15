package Exercises.EqualSumChecker;

public class EqualSumChecker {
    public static boolean hasEqualSum(int x, int y, int z) {
        return (x + y) == z;
    }

    public static void main(String[] args) {
        boolean test = hasEqualSum(1, 2, 3);
        System.out.println(test);
    }
}
