package numberbaseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {
    @Test
    void 비교테스트() {
        Ball computerBall = new Ball(1, 1);
        Ball userBall = new Ball(1, 1);
        String 결과 = userBall.matchStatus(computerBall); // STRIKE | BALL | NOTHING
        assertThat(결과).isEqualTo("STRIKE");
    }
    @Test
    void 비교테스트2() {
        Ball computerBall = new Ball(1, 1);
        Ball userBall = new Ball(1, 3);
        String 결과 = userBall.matchStatus(computerBall); // STRIKE | BALL | NOTHING
        assertThat(결과).isEqualTo("BALL");
    }

    @Test
    void 비교테스트3() {
        Ball computerBall = new Ball(1, 1);
        Ball userBall = new Ball(1, 3);
        userBall.ballstatus(computerBall);
        int ball개수 = userBall.ballcount;
        assertThat(ball개수).isEqualTo(1);
    }

}
