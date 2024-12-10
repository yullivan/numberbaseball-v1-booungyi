package numberbaseball;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Ball {
    private int number; // 숫자 1개
    private int position;  // 위치 정보

    public int getNumber() {
        return number;
    }

    public int getPosition() {
        return position;
    }

    public Ball(int number, int position ) {
        this.number = number;
        this.position = position;
        //private 는 같은 클래스 파일 내에서만 접근(읽기/쓰기)가능 그외에는 절대 접근할수없음
        //protectded 는 같은 패키지 내의 클래스 ppackage 뒤 경로가 같으면 접근가능
    }

    public String matchStatus(Ball other) {
        if (number==other.number&&position==other.position) {
            return  "STRIKE";
        } else if (number == other.number) {
            return  "BALL";
        } else {
            return "NOTHING";
        }
    }

    public Ball() {
        super();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return number == ball.number && position == ball.position;
    }
    @Override
    public int hashCode() {
        return Objects.hash(number, position);
    }
}
