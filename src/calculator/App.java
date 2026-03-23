package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {

            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int number1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요 : ");
            int number2  = sc.nextInt();

            System.out.print("사칙 연산 기호를 입력하세요 : ");
            char operator = sc.next().charAt(0);

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

            if (inquiryText.equals("inquiry")){
                System.out.println("현재 저장된 결과: " + calculator.getResults());
            }

            System.out.print("더 계산하시겠습니까? (exit 입력시 종료) : " );
            String text = sc.next();
            if (text.equals("exit")) {
                break;
            }
        }
    }
}

//package calculator; // 분석해보기  // Exception(예외)
//
//import java.util.Scanner;
//
//public class App {
//    static void main() {
//        Calculator calculator = new Calculator();
//
//
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) { // 종결조건식이 true 일 때 무한반복 / break로 빠져나가기
//
//
//
//            System.out.print("첫 번째 양의 정수를 입력해보세요 : ");
//            int number1 = scanner.nextInt(); // 예외처리 필요
//            if (number1 < 0) {
//                System.out.println("양의 정수를 입력하세요");
//                continue; // 다시 처음으로
//            }
//
//            System.out.print("두 번째 양의 정수를 입력해보세요 : ");
//            int number2 = scanner.nextInt();
//            if (number2 < 0) {
//                System.out.println("양의 정수를 입력하세요");
//                continue; // 다시 처음으로 돌아가기
//            }
//
//            System.out.print("사칙연산 기호를 입력하세요 : ");
//            char operator = scanner.next().charAt(0);
//
//
//            // 값을 불러오기
//            int result = calculator.calculator(number1, number2, operator);
//
//
//
//            if (number2 == 0 && operator == '/') {
//                System.out.println("0으로 나눌수가 없습니다.");
//                continue;
//            }
//
//
//            scanner.nextLine();
//            // exit 을 입력받으면 프로그램 종료
//            System.out.println("exit를 입력하면 프로그램을 종료하겠습니다.");
//            System.out.print("계속 진행하시려면 아무거나 입력해주세요 : ");
//            System.out.println("List : " + calculator.getResults());
//            String exit = scanner.nextLine();
//            if (exit.equals("exit")) {
//                break;
//                // return 돌려준다 메서드를 끝낸다.
//            }
//
//
//        }
//        System.out.println("가장먼저 저장된 데이터를 삭제하시겠습니까? : ");
//        String removeText = scanner.next();
//        if (removeText.equals("yes")) {
//            calculator.removeResult();
//        }
//
//        System.out.println("프로그램을 종료합니다.");
//
//
//    }
//}