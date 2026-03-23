package calculator;

public class Calculator {
    public int calculator(int number1, int number2, char operator) {
        while (true) {

            int result = 0;

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
        }
    }
    
}
