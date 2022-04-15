import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        boolean isWork = true;
        while(isWork) {
            System.out.print("Введите первое число: ");
            calc.x = scan.nextInt();
            do {
                System.out.print("Введите знак математической операции: ");
                calc.sign = scan.next().charAt(0);
                if((calc.sign == '+') || (calc.sign == '-') || (calc.sign == '*') || (calc.sign == '/') || (calc.sign == '%') || (calc.sign == '^')) {
                    break;
                } else {
                    System.out.println("Такой операции нет. Доступные операции: +, -, *, /, %, ^.");
                }
            } while(true);
            System.out.print("Введите второе число: ");
            calc.y = scan.nextInt();
            System.out.println("Ответ: " + calc.operation());

            do { /*Не понимаю почему следующая строка у меня дважды выводится в консоль, 
                  Вот так: Хотите продолжить вычисления? [yes/no]:Хотите продолжить
                   вычисления? [yes/no]:*/
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                String answer = scan.nextLine();
                if(answer.equals("no")) {
                    isWork = false;
                } else if(answer.equals("yes")) {
                    break;
                }
            } while(isWork);
        }
    }
}