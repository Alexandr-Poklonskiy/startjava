public class Calculator {
    private int x;
    private int y;
    private char sign;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public int calculate() {
        switch (sign) {
            case '+' :
                return x + y;
            case '-' :
                return x - y;
            case '*' :
                return x * y;
            case '/' :
                return x / y;
            case '%' :
                return x % y;
            case '^' :
                int result = 1;
                for(int i = 0; i < y; i++) {
                    result *= x;
                }
                return result;
            default :
                return 0;
        }
    }
}