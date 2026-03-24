package calculator;

import java.util.ArrayList;

public class Calculator {

    ArrayList<Integer> results = new ArrayList<>();

    public int calculator (int first, int second, char operator) {
        int result = 0;

        switch (operator) {
            case '+': result = first + second;
                break;

            case '-' : result = first - second;
                break;

            case '*' : result = first * second;
                break;

            case  '/' :
                if (second == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    break;

                } else {
                    result = first / second;
                    break;
                }
            default:
                System.out.println("올바른 사칙연산을 입력해주세요.");
        }
        results.add(result);
        return result;

    }

    public ArrayList<Integer> getResults(){
        return results;
    }
    public void setResults() {
        this.results = results;
    }
    public void removeResults() {
        results.remove(0);
    }
}