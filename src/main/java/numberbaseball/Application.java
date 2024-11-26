package numberbaseball;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean isCorrect = false;

        int computernumber1 = 3;
        int computernumber2 = 6;
        int computernumber3 = 9;
        System.out.println("숫자 야구 게임을 시작합니다!");
        System.out.println("1부터 9까지의 서로 다른 숫자 3개를 맞춰보세요.");

        while (!isCorrect) {
            int strike = 0;
            // 사용자 입력 받기 (이 부분은 완성되어 있음)
            System.out.print("\n첫 번째 숫자를 입력하세요: ");
            int userNumber1 = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int userNumber2 = scanner.nextInt();
            System.out.print("세 번째 숫자를 입력하세요: ");
            int userNumber3 = scanner.nextInt();

            // TODO: strike 개수를 계산하세요
            if (computernumber1 == userNumber1) {
                strike++;
            }
            if (computernumber2 == userNumber2) {
                strike++;
            }
            if (computernumber3 == userNumber3) {
                strike++;
            }

            // TODO: 결과를 출력하세요 (예: "1 스트라이크")
            System.out.printf("%d 스트라이크",strike);

            // TODO: 3 스트라이크인 경우 게임을 끝내세요
            if (strike == 3) {
                System.out.println("축하합니다! 정답을 맞추셨습니다.");
                isCorrect = true;
            }
        }
    }
}
