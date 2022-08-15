package Exercises.Expr_Statem_CBlock_Method;

public class Methods {
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
       /* boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;*/

        int finalscore = score + (levelCompleted * bonus);
        System.out.println("Final score is: " + finalscore);
    }

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        calculateScore(true, 800, 5, 100);

        score = 10000;
        levelCompleted = 35;
        bonus=20;

        calculateScore(true,score,levelCompleted,bonus);


    }
}
