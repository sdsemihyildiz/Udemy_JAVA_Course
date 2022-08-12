package Expr_Statem_CBlock_Method;

public class CodeBlocks {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        if (gameOver) {
            int finalscore = score + (levelCompleted * bonus);
            System.out.println("Your final score is : " + finalscore);

        }

        int secondScore = 10000;
        int secondLevelCompleted = 8;
        int secondBonus = 200;

        boolean gameOverTwo = true;
        if (gameOverTwo) {
            int finalScore = secondScore + (secondLevelCompleted * secondBonus);
            System.out.println("Your final Score is: " + finalScore);
        }
    }
}
