package calculator;

import java.util.ArrayList;

public class Calculator {

    ArrayList<Integer> results = new ArrayList<>();

    public int calculator(int first, int second, Four operator) {
        int result = 0;

        switch (operator) {
            case PLUS:
                result = first + second;
                break;

            case MINUS:
                result = first - second;
                break;

            case MULTIPLE:
                result = first * second;
                break;

            case DIVIDED:
                result = first / second;
                break;
        }
        results.add(result);
        return result;

    }

    public ArrayList<Integer> getResults() {
        return results;
    }

    public void setResults() {
        this.results = results;
    }

    public void removeResults() {
        results.remove(0);
    }
}