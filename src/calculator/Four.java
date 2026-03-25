package calculator;

public enum Four {
    PLUS('+'), MINUS('-'), MULTIPLE('*'), DIVIDED('/');

    private char operator;

    Four (char operator) {
        this.operator = operator;
    }

    public static Four fromChar (char operator) {
        for (Four oper : Four.values()) {
            if (oper.operator == operator) {
                return oper;
            }
        }
        throw new IllegalArgumentException("에러");
    }

}










//📦 박스(operator)에 '+' 가 들어있어요
//getOperator() 는 그 박스를 열어서 꺼내주는 행위예요!
//
//
//그래서 나중에 이렇게 쓸 수 있어요:
//javaFour.PLUS.getOperator()  // '+' 를 꺼내줌
//Four.MINUS.getOperator() // '-' 를 꺼내줌
