package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {

            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int number1 = sc.nextInt();
            if (number1 < 0) {
                System.out.println("양의 정수를 입력하세요");
                continue; // 다시 처음으로
            }


            System.out.print("두 번째 숫자를 입력하세요 : ");
            int number2 = sc.nextInt();
            if (number2 < 0) {
                System.out.println("양의 정수를 입력하세요");
            }

            // 잘못 입력했으면 사칙연산 기호를 다시 입력받게 해야한다.
            System.out.print("사칙 연산 기호를 입력하세요 : ");
            char operator = sc.next().charAt(0);

            if (number2 == 0 && operator == '/') {
                System.out.println("0으로 나눌수가 없습니다.");
                continue;
            }

            int result = calculator.calculator(number1, number2, operator);


            System.out.println("결과 : " + result);

            System.out.print("가장 먼저 저장된 데이터를 삭제하시겠습니까? (yes 입력 시 삭제) : ");
            String removeText = sc.next();
            if (removeText.equals("yes")) {
                calculator.removeResult();
                System.out.println("데이터가 삭제되었습니다.");
            }

            System.out.print("저장된 결과를 조회하시겠습니까?" + "(inquiry 입력 시 조회) : ");
            String inquiryText = sc.next();

            if (inquiryText.equals("inquiry")) {
                System.out.println("현재 저장된 결과: " + calculator.getResults());
            }

            System.out.print("더 계산하시겠습니까? (exit 입력시 종료) : ");
            String text = sc.next();
            if (text.equals("exit")) {
                break;
            }
        }
    }
}