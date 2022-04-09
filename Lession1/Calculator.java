public class Calculator {
    public static void main(String[] args) {
        // 1. Калькулятор.
        System.out.println("\n1. Калькулятор.");
        int x = 25;
        int y = 2;
        int resalt = 0;
        int exp = x;
        char sign = '/';
        boolean isSignCorrect = true;
        if(sign == '+') {
            resalt = x + y;
        } else if(sign == '-') {
            resalt = x - y;
        } else if(sign == '*') {
            resalt = x * y;
        } else if(sign == '/') {
            resalt = x / y;
        } else if(sign == '^') {
            for(int i = y; i > 0; i--) {
                exp = exp * x;
            }
            resalt = exp;
        } else if(sign == '%') {
            resalt = x % y;
        } else {
            System.out.println("Такой команды нет.");
            isSignCorrect = false;
        }
        if(isSignCorrect) {
        System.out.println(x + " " + sign + " " + y + " = " + resalt);
        }

        // 2. Игра “Угадай число”.
        System.out.println("\n2. Игра \"Угадай число\".");
        int number = 24;
        int guessNum = 50;
        int step = 25;
        while(guessNum != number) {
            if(guessNum < number) {
                System.out.println("Данное число "+ guessNum + " меньше того, что загадал компьютер");
                guessNum += step;
            } else {
                System.out.println("Данное число " + guessNum + " больше того, что загадал компьютер");
                guessNum -= step;
            }
            step -= step/2;
        }
        System.out.println("Искомое число " + guessNum + " Вы победили!");
    }
}