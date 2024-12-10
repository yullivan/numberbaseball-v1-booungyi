package numberbaseball;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Application {


    public static void main(String[] args) {
        ArrayList otherball = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        GameResult gameResult = new GameResult();
        System.out.println("1부터 9까지 숫자 입력");
        int randint1 = random.nextInt((9) + 1);
        int randint2 = random.nextInt((9) + 1);
        int randint3 = random.nextInt((9) + 1);
        otherball.add(randint1);
        otherball.add(randint2);
        otherball.add(randint3);

        Ball other1 = new Ball(randint1, 1);
        Ball other2 = new Ball(randint2, 2);
        Ball other3 = new Ball(randint3, 3);

        while (!gameResult.isGameOver()) {
            ArrayList youbal = new ArrayList<>();
            gameResult.reset();
            System.out.println("3개의 숫자를 입력하세요");
            int userInput1 = sc.nextInt();
            int userInput2 = sc.nextInt();
            int userInput3 = sc.nextInt();

            youbal.add(userInput1);
            youbal.add(userInput2);
            youbal.add(userInput3);

            Ball yourBall1 = new Ball(userInput1, 1);
            Ball yourBall2 = new Ball(userInput2, 2);
            Ball yourBall3 = new Ball(userInput3, 3);

            gameResult.incementCount(yourBall1.matchStatus(other1));
            gameResult.incementCount(yourBall2.matchStatus(other2));
            gameResult.incementCount(yourBall3.matchStatus(other3));
            System.out.println("유저 공들 : "+youbal);
            System.out.println("컴퓨터 공들 : "+ otherball);
            if (gameResult.isGameOver()) {
                System.out.println("3스트라이크 게임종료.");
                break;
            }
        }

    }
}


