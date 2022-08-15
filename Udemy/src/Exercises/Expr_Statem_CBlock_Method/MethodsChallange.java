package Exercises.Expr_Statem_CBlock_Method;

import java.util.Scanner;

public class MethodsChallange {
    public static void displayHighScorePosition(String player, int position) {


    }

    public static void calculateHighScorePosition(int score) {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String player = scanner.nextLine();
        int position = scanner.nextInt();
        int score = scanner.nextInt();
        scanner.close();
        displayHighScorePosition(player, position);
        calculateHighScorePosition(score);
        if (score > 1000) {
            System.out.println(player + ", You are the winner, your position is " + position + " and your score is " + score);
        } else if (score < 1000 && score > 500) {
            System.out.println(player + ", You got the second place and your score is " + score);

        } else if (score > 100 && score < 500) {
            System.out.println(player + ", You got the third place and your score is " + score);

        } else {
            System.out.println("Your score is: " + score);
        }

    }
}
