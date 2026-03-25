package calculator;

import java.lang.management.OperatingSystemMXBean;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("첫 번째 양의 정수를 입력하세요 : ");
            int first = scanner.nextInt();
            if (first < 0) {
                System.out.println("양의 정수를 입력해주세요.");
                continue;
            }

            System.out.println("두 번째 양의 정수를 입력하세요 : ");
            int second = scanner.nextInt();
            if (second < 0) {
                System.out.println("양의 정수를 입력해주세요.");
                continue;
            }

            System.out.println("사칙연산 기호를 입력하세요 : ");
            char operator = scanner.next().charAt(0);

            if (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
                System.out.println("올바른 사칙연산 기호를 입력해주세요.");
                continue;
            }

            if (operator == '/' && second == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                continue;
            }

            int result = calculator.calculator(first, second, Four.fromChar(operator));
            System.out.println("결과 : " + result);

            System.out.println("기록을 조회하시겠습니까?(yes 입력 시 조회) : ");
            String yes = scanner.next();
            if (yes.equals("yes")) {
                System.out.println("List : " + calculator.getResults());
            }

            System.out.println("첫 번째 기록을 삭제하시겠습니까?(yes 입력 시 삭제) : ");
            String yes2 = scanner.next();
            if (yes2.equals("yes")) {
                calculator.removeResults();
                System.out.println("삭제 완료");
            }

            System.out.println("현재 List : " + calculator.getResults());

            System.out.println("종료하려면 exit를 입력해주세요(아무거나 입력 시 계속) : ");
            String exit = scanner.next();
            if(exit.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

        }

    }
}