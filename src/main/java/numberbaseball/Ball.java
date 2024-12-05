package numberbaseball;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ball {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    int number; // 숫자 1개
    int position;  // 위치 정보
    int strikecount = 0;
    int ballcount = 0;

    public Ball(int number, int position) {
        this.number = number;
        this.position = position;
    }

    public String matchStatus(Ball other) {
        System.out.println("this number:" + number);
        System.out.println("other number:" + other.number);
        number = sc.nextInt();
        other.number = random.nextInt((9)+1);

        if (other.number == number && other.position == position) {
            position++;
            other.position ++;
            return "STRIKE";
        }
        if (other.number == number) {
            position++;
            other.position ++;
            return "BALL";
        }
        position++;
        other.position ++;
        return "NOTHING";
    }
    public int ballstatus(Ball other) {
        System.out.println("this number: " + number);
        System.out.println("other number: " + other.number);
        if (number == other.number && other.position == position) {
            strikecount++;
        }
        if (number == other.number) {
            ballcount++;
        }
        return 0;
    }
}
