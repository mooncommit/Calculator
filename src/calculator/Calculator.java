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

            case  '/' : result = first / second;
            break;
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