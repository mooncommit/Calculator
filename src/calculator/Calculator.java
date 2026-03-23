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

    // void - 리턴값이 없다
    public void setResults() {
        this.results = results;

    }

    // remove
    public void removeResult() {
        results.remove(0);
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
