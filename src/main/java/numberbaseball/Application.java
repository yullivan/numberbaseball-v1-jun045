package numberbaseball;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 야구 게임을 시작합니다!");
        System.out.println("1부터 9까지의 서로 다른 숫자 3개를 맞춰보세요.");

        boolean isCorrect = false;
        int 변수1 = 2;
        int 변수2 = 4;
        int 변수3 = 6;


        while (!isCorrect) {
            // 사용자 입력 받기 (이 부분은 완성되어 있음)
            System.out.print("\n첫 번째 숫자를 입력하세요: ");
            int user1 = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int user2 = scanner.nextInt();
            System.out.print("세 번째 숫자를 입력하세요: ");
            int user3 = scanner.nextInt();

            // TODO: strike 개수를 계산하세요


            // TODO: 결과를 출력하세요 (예: "1 스트라이크")


            // TODO: 3 스트라이크인 경우 게임을 끝내세요

            int strike = 0;  //while문 안에 써줘야 스트라이크가 0으로 리셋됨, 아니면 스트라이크 누적됨

            if (user1 == 변수1) {

                strike = strike + 1;

                System.out.println(strike);

            }
            if (user2 == 변수2) {

                strike = strike + 1;

                System.out.println(strike);

            }
            if (user3==변수3){

                strike = strike +1;

                System.out.println(strike);

            }
            System.out.println(strike + " 스트라이크");
            if(strike==3){
                System.out.println("게임종료");
                isCorrect = true;
        }


    }

        System.out.println("축하합니다! 정답을 맞추셨습니다.");
}

}
