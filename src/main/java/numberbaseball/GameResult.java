package numberbaseball;

public class GameResult {
    private int strikecount = 0;
    private int ballcount = 0;
    private int nocount = 0;

    public void reset() {
        strikecount = 0;
        ballcount = 0;
        nocount = 0;
    }
    public void incementCount (String status) {
        if (status.equals("STRIKE")) {
            strikecount++;
        } else if (status.equals("BALL")) {
            ballcount++;
        } else {
            nocount++;
        }
    }

    public boolean isGameOver() {
        if (strikecount+ballcount+nocount== 3) {
            System.out.printf("%d strike %d ball\n", strikecount, ballcount);
        }
        if (strikecount == 3) {
            return true;
        }
        return false;
    }
}
