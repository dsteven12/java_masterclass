public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore + ".");

        newScore = calculateScore(900);
        System.out.println("New score is " + newScore + ".");

        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name or score given.");
        return 0;
    }
}
