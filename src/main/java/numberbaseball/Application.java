package numberbaseball;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("1부터 9까지 숫자 입력");
        Ball other = new Ball(random.nextInt(), 1);
        Ball yourball = new Ball(sc.nextInt(), 1);
        boolean gameset = true;
        while (gameset) {
            String ballstrike = yourball.matchStatus(other);
            System.out.println(ballstrike);

            System.out.println(yourball.ballstatus(other));
            if (other.strikecount == 3) {
                gameset = false;
            }
        }
    }
}


