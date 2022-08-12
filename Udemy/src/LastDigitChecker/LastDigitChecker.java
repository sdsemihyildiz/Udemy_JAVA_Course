package LastDigitChecker;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        int lastDigitA = 0;
        int lastDigitB = 0;
        int lastDigitC = 0;

        if (a < 10 || a > 1000 || b < 10 || b > 1000 || c < 10 || c > 1000) {
            return false;
        }
        lastDigitA = a % 10;
        lastDigitB = b % 10;
        lastDigitC = c % 10;
        if ((lastDigitA == lastDigitB) || (lastDigitA == lastDigitC) || (lastDigitB == lastDigitA) || (lastDigitB == lastDigitC)) {

            return true;
        }

        return false;

    }

    public static boolean isValid(int z) {
        return (z >= 10 && z <= 1000);
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(15, 25, 30));
    }
}
