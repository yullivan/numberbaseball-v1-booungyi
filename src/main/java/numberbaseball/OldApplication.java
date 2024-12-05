package numberbaseball;

import java.util.*;

public class OldApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean isCorrect = false;
        출처: https://e-you.tistory.com/214 [Development:티스토리]
//        int computernumber1 = 3;
//        int computernumber2 = 6;
//        int computernumber3 = 9;

        System.out.println("숫자 야구 게임을 시작합니다!");
        System.out.println("1부터 9까지의 서로 다른 숫자 3개를 맞춰보세요.");
        List<Integer> computerNumbers = new ArrayList<>();
//        Set<Integer> set = new HashSet<>();

        Random random = new Random();
        computerNumbers.add(random.nextInt(9) + 1);
        computerNumbers.add(random.nextInt(9)+1);
        computerNumbers.add(random.nextInt(9)+1);


        while (!isCorrect) {
            List<Integer> userNumbers = new ArrayList<>();

            int strike = 0;
            int ball = 0;

            // 사용자 입력 받기 (이 부분은 완성되어 있음)
            System.out.print("\n첫 번째 숫자를 입력하세요: ");
            userNumbers.add(scanner.nextInt());
            System.out.print("두 번째 숫자를 입력하세요: ");
            userNumbers.add(scanner.nextInt());
            System.out.print("세 번째 숫자를 입력하세요: ");
            userNumbers.add(scanner.nextInt());

            // TODO: strike 개수를 계산하세요
            for (int i = 0; i < 3; i++) {
                if (computerNumbers.get(i).equals(userNumbers.get(i))) {
                    strike++;
                }
            }
            // TODO: ball 개수 계산
            for (int i  = 0; i < 3; i++) {
                if (!computerNumbers.get(i).equals(userNumbers.get(i)))
                {
                    ball++;
                }
            }
//            if (!computerNumbers.get(0).equals(computerNumbers.get(0))) {
//                ball++;
//            }if (computerNumbers.get(0) != computerNumbers.get(0)) {
//                ball++;
//            }if (computerNumbers.get(0) != computerNumbers.get(0)) {
//                ball++;
            // TODO: 결과를 출력하세요 (예: "1 스트라이크")
            System.out.printf("%d 스트라이크 %d 볼\n",strike,ball);
            // TODO: 3 스트라이크인 경우 게임을 끝내세요
            if (strike == 3) {
                System.out.println("축하합니다! 정답을 맞추셨습니다.");
                isCorrect = true;
            }
        }
    }
}
