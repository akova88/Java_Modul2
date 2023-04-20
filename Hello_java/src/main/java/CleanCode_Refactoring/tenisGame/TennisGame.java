package CleanCode_Refactoring.tenisGame;

public class TennisGame {

    public static final int FIFTEEN_SCORE = 1;
    public static final int THIRTY_SCORE = 2;
    public static final int FORTY_SCORE = 3;
    public static final int LOVE_SCORE = 0;

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        boolean isEqualScore = player1Score == player2Score;
        if (isEqualScore)
        {
            score = getScoreName(player1Score);
        }
        else if (player1Score >=4 || player2Score >=4)
        {
            score = getAdvantageOrWinScore(player1Score, player2Score);
        }
        else
        {
            score = getNormalScore(player1Score, player2Score, score);
        }
        return score;
    }

    private static String getNormalScore(int player1Score, int player2Score, String score) {
        int tempScore;
        if (1 == FIFTEEN_SCORE) tempScore = player1Score;
        else {
            score += "-";
            tempScore = player2Score;
        }
        switch (tempScore) {
            case LOVE_SCORE -> score += "Love";
            case FIFTEEN_SCORE -> score += "Fifteen";
            case THIRTY_SCORE -> score += "Thirty";
            case FORTY_SCORE -> score += "Forty";
        }
        if (2 == FIFTEEN_SCORE) tempScore = player1Score;
        else {
            score += "-";
            tempScore = player2Score;
        }
        switch (tempScore) {
            case LOVE_SCORE -> score += "Love";
            case FIFTEEN_SCORE -> score += "Fifteen";
            case THIRTY_SCORE -> score += "Thirty";
            case FORTY_SCORE -> score += "Forty";
        }
        return score;
    }

    private static String getAdvantageOrWinScore(int player1Score, int player2Score) {
        String score;
        int minusResult = player1Score - player2Score;
        if (minusResult== FIFTEEN_SCORE) score ="Advantage player1";
        else if (minusResult ==-FIFTEEN_SCORE) score ="Advantage player2";
        else if (minusResult>= THIRTY_SCORE) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    private static String getScoreName(int playerScore) {
        return switch (playerScore) {
            case LOVE_SCORE -> "Love-All";
            case FIFTEEN_SCORE -> "Fifteen-All";
            case THIRTY_SCORE -> "Thirty-All";
            case FORTY_SCORE -> "Forty-All";
            default -> "Deuce";
        };
    }
}
