public class Calculator {

    int x;
    int y;
    char sign;

    public int operation() {
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