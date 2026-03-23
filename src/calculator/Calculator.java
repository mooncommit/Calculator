package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private ArrayList<Integer> results = new ArrayList<>();


    public int calculator(int number1, int number2, char operator) {

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
        }
        results.add(result); // 결과에 저장 더하는거
        return result; // 반환
    }

    public ArrayList<Integer> getResults() {
        return results;
}
    // void - 리턴값이 없다
    public void setResults() {
        this.results = results;

    }
}

// 게터 - 내 정보를 조회한다.
// 세터 - 내 정보를 수정한다.

// 게터 - 속성을 가져오는 기능
//String getName() {
//    return this.name;
//}


// 세터 - 속성을 설정하는 기능

//void setAddress(String address) {
//    this.address = address;
//}
//}
