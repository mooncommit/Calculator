package calculator; // 분석해보기  // Exception(예외)

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        while (true) { // 종결조건식이 true 일 때 무한반복 / break로 빠져나가기

            System.out.print("첫 번째 양의 정수를 입력해보세요 : ");
            int number1 = scanner.nextInt(); // 예외처리 필요
            if (number1 < 0) {
                System.out.println("양의 정수를 입력하세요");
                continue; // 다시 처음으로
            }

            System.out.print("두 번째 양의 정수를 입력해보세요 : ");
            int number2 = scanner.nextInt();
            if (number2 < 0) {
                System.out.println("양의 정수를 입력하세요");
                continue; // 다시 처음으로 돌아가기
            }

            System.out.print("사칙연산 기호를 입력하세요 : ");
            char operator = scanner.next().charAt(0);

            if (number2 == 0 && operator == '/') {
                System.out.println("0으로 나눌수가 없습니다.");
                continue;
            }

            int result; // 결과값


            // if를 사용해서 +, -, *, / 를 제공
            // 결과값을 출력한다.
            if (operator == '+') {
                result = number1 + number2;
                System.out.println(result);
            } else if (operator == '-') {
                result = number1 - number2;
                System.out.println(result);
            } else if (operator == '*') {
                result = number1 * number2;
                System.out.println(result);
            } else if (operator == '/') { // 항상 코드는 위에서 아래대로 흐른다 // 범위를 잘보기!!!!
                result = number1 / number2;
                System.out.println(result);
            } else {
                System.out.println("잘못 입력했습니다.");
                continue;
            }
            scanner.nextLine();
            // exit 을 입력받으면 프로그램 종료
            System.out.println("exit를 입력하면 프로그램을 종료하겠습니다.");
            System.out.print("계속 진행하시려면 아무거나 입력해주세요 : ");
            String exit = scanner.nextLine();
            if (exit.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
                // return 돌려준다 메서드를 끝낸다.
            }

        }

    }
}
