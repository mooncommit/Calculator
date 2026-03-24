package calculator;

import java.util.ArrayList;

public class Calculator {

    private ArrayList<Integer> results = new ArrayList<>();

    public int calculator(int number1, int number2, char operator) {

        int result = 0;

        if (operator == '+') {
            result = number1 + number2;

        } else if (operator == '-') {
            result = number1 - number2;

        } else if (operator == '*') {
            result = number1 * number2;

        } else if (operator == '/') {
            result = number1 / number2;
        }
        return result; // 전달
    }


    public ArrayList<Integer> getResults() {
        return results;
    }

    public void addResults(int result) {
        this.results.add(result);
    }

    // results가 비어있지 않을 때만, 첫 번째 항목을 지워라

    public void removeResult() {
        if (!results.isEmpty()) {   // "대기열이 비어있지 않다면?"
            results.remove(0);      // 그때만 첫 번째 항목 제거
        }
        // 비어있으면? 그냥 아무것도 안 함 (안전하게 넘어감)
    }

}
// void - 리턴값이 없다
// 세터는 외부에서 값을 받아서 필드를 수정하는 역할인데,
// 매개변수가 없어서 this.results = results가 자기 자신을 자기 자신에게 대입하는 무의미한 코드
//    public void setResults() {
//        this.results = results;
//
//    }

// remove
//    public void removeResult() {
//        results.remove(0);
//    }
//}

// 게터 - 내 정보를 조회한다.
// 세터 - 내 정보를 수정한다.

