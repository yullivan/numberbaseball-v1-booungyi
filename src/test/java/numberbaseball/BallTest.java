package numberbaseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {


    @Test
    void ballEqualsTest() {
        // given
        // 같은 값의 Ball 오브젝트 두 개가 있는 상황에서
        Ball ball1 = new Ball(1, 3);
        Ball ball2 = new Ball(1, 3);

        // when
        // 두 오브젝트를 equals()로 비교했을 때
        Boolean 비교결과 = ball1.equals(ball2);

        // then
        // 비교 결과는 true가 나와야 한다
        assertThat(비교결과).isTrue();
    }
}

//    @Test
//    void test3() {
//        GameResult gameResult = new GameResult();
//        Ball ball1 = new Ball(1, 3);
//        Ball ball2 = new Ball(1, 3);
//
//        while (!gameResult.isGameOver(gameResult.inCrementCount(Ball.status))) {
//            ball1.matchStatus(ball2);
//            gameResult.inCrementCount(Ball.status);
//            gameResult.isGameOver(gameResult.inCrementCount(Ball.status));
//            }
//        }
//    }



//    @Test
//    void 비교테스트() {
//        Ball computerBall = new Ball(1, 1);
//        Ball userBall = new Ball(1, 1);
//        String 결과 = userBall.matchStatus(computerBall); // STRIKE | BALL | NOTHING
//        assertThat(결과).isEqualTo("STRIKE");
//    }
//    @Test
//    void 비교테스트2() {
//        Ball computerBall = new Ball(1, 1);
//        Ball userBall = new Ball(1, 3);
//        String 결과 = userBall.matchStatus(computerBall); // STRIKE | BALL | NOTHING
//        assertThat(결과).isEqualTo("BALL");
//    }
//
//    @Test
//    void 비교테스트3() {
//        Ball computerBall = new Ball(1, 1);
//        Ball userBall = new Ball(1, 3);
//        userBall.ballstatus(computerBall);
//        int ball개수 = userBall.ballcount;
//        assertThat(ball개수).isEqualTo(1);
//    }
//
//}
