public class Calculator {
    public static void main(String[] args) {
        // 1. Калькулятор.
        System.out.println("Калькулятор.");
        int x = 3;
        int y = 5;
        int result = x;
        char sign = '^';
        if(sign == '+') {
            result = x + y;
        } else if(sign == '-') {
            result = x - y;
        } else if(sign == '*') {
            result = x * y;
        } else if(sign == '/') {
            result = x / y;
        } else if(sign == '^') {
            for(int i = y; i > 1; i--) {
                result *= x;
            }
        } else if(sign == '%') {
            result = x % y;
        } else {
            System.out.println("Такой команды нет.");
            return;
        }

        System.out.println(x + " " + sign + " " + y + " = " + result);
    }
}