public class Main {
    public static void main(String[] args) {
        int highScore = calculateScore(true,800,5,100);
        displayScore(highScore);
        displayHighScorePosition("Darryl", calculateHighScorePosition(highScore));

        highScore = calculateScore(true,10000,8,200);
        displayScore(highScore);
        displayHighScorePosition("Darryl", calculateHighScorePosition(highScore));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayScore(int display) {
        System.out.println("Your final score was " + display);
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table." );
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;

        if(score >= 1000) {
            position = 1;
        } else if(score >= 500) {
            position = 2;
        } else if(score >= 100) {
            position = 3;
        }

        return position;
    }
}
