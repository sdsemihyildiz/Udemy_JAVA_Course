package Exercises.FlourPackProblem;

public class FlourPacker {


    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;


        int sum = (bigCount * 5) + smallCount;
        if (sum >= goal && (goal % 5) <= smallCount)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {

    }
}
