import java.text.DecimalFormat;

public class CyclesTheme {
    public static void main(String[] args) {
        // 1. Подсчет суммы четных и нечетных чисел.
        System.out.println("1. Подсчет суммы четных и нечетных чисел.");
        int num1 = -10;
        int num2 = 21;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if(num1 % 2 == 0) {
                sumEven += num1;
            }else{
                sumOdd += num1;
            }
            num1++;
        } while(num1 <= num2);
        System.out.println("Сумма чётных чисел: " + sumEven + ". Сумма нечетных: " + sumOdd + ".");

        // 2. Вывод чисел между max и min.
        System.out.println("\n2. Вывод чисел между max и min.");
        num1 = 10;
        num2 = 5;
        int num3 = -1;
        int maxN = 10;
        int minN = 5;
        if(num1 > num2) {
            if(num1 > num3) {
                if(num2 > num3) {
                    minN = num3;
                } else {
                minN = num2;
                }
            }
        } else if(num2 > num3) {
            maxN = num2;
                if(num1 > num3) {
                minN = num3;
                } else {
                minN = num1;
                }
        } else {
            maxN = num3;
            minN = num1;
        }

        for(int i = ++minN; i < maxN; i++) {
            System.out.print(i + " ");
        }

        // 3. Вывод реверсивного числа и суммы его цифр.
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр.");
        int number = 1234;
        int sum = 0;
        while(number != 0) {
            int revNumber = number % 10;
            sum += revNumber;
            number /= 10;
            System.out.print(revNumber);
        }
        System.out.println("\nСумма чисел: " + sum);

        // 4. Вывод чисел на консоль в несколько строк
        System.out.println("\n4. Вывод чисел на консоль в несколько строк.");
        int currNum = -1;
        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 5; j++) {
                currNum += 2;
                if(currNum > 24) {
                    System.out.print("00 ");
                } else {
                    System.out.print(new DecimalFormat("00").format(currNum) + " ");
                }
            }
            System.out.println();
        }


        // 5. Проверка количества единиц на четность
        System.out.println("\n\n5. Проверка количества единиц на четность");
        number = 3141591;
        int onesSum = 0;
        while(number != 0) {
            currNum = number % 10;
            if(currNum == 1) {
                onesSum += currNum;
            }
            number/= 10;
        }
        if(onesSum % 2 == 0) {
            System.out.println("Колличество едениц чётное число " + onesSum);
        } else {
            System.out.println("Колличество едениц не чётное число " + onesSum);
        }

        // 6. Отображение фигур в консоли.
        System.out.println("\n6. Отображение фигур в консоли.");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int i = 5;
        int j = 0;
        while(i > 0) {
            while(j < i) {
                System.out.print("#");
                j++;
            }
            i--;
            j = 0;
            System.out.println();
        }
        // Я не понял как третью фигуру сделать одним блоком вложенных циклов... Сделал двумя.
        i = 0;
        j = 1;
        do {
            do {
                System.out.print("$");
                j++;
            } while(j <= i);
            System.out.println();
            i++;
            j = 0;
        } while(i < 3);

        i = 1;
        do {
            do {
                System.out.print("$");
                j++;
            } while(j <= i);
            System.out.println();
            i--;
            j = 1;
        } while(i >= 0);

        /*// 7. Отображение ASCII-символов.
        System.out.println("\n7. Отображение ASCII-символов.");
        System.out.println("Dec Char");
        for(i = 0; i < 127; i++) {
            char simbol = (char)i;
            System.out.println(i + "   " + simbol);
        }*/

        // 8. Проверка, является ли число палиндромом.
        System.out.println("\n8. Проверка, является ли число палиндромом.");
        number = 12321;
        int copyNumber = number;
        int revNumber = 0;
        while(number != 0) {
            revNumber *= 10;
            revNumber += number % 10;
            number /= 10;
        }
        if(copyNumber == revNumber) {
            System.out.println("Число " + copyNumber + " является палиндромом.");
        } else {
            System.out.println("Число " + copyNumber + " не является палиндромом.");
        }

        // 9. Определение, является ли число счастливым.
        /* Не могу придумать как выделить и записать каждую цифру отдельно.
        Смог просто проверить на "счастливость"*/
        System.out.println("\n9. Определение, является ли число счастливым.");
        number = 456375;
        int abc = number / 1000;
        int sumAbc = 0;
        while(abc != 0) {
            currNum = abc % 10;
            sumAbc += currNum;
            abc /= 10;
        }
        int sumDef = 0;
        for(i = 0; i < 3; i++) {
            currNum = number % 10;
            sumDef += currNum;
            number /= 10;
        }
        if(sumAbc == sumDef) {
            System.out.println("Сумма первых трёх чисел равно " + sumAbc + " Сумма последних " + sumDef + " Число счастливое.");
        } else {
            System.out.println("Сумма первых трёх чисел равно " + sumAbc + " Сумма последних " + sumDef + " Число не счастливое.");
        }

        // 10. Вывод таблицы умножения Пифагора.
        System.out.println("\n10. Вывод таблицы умножения Пифагора.");
        for (i = 1; i < 10; i++) {
            for(j = 1; j < 10; j++) {
                if(j * i == 1) {
                    System.out.print("   ");
                } else {
                System.out.print(new DecimalFormat("00").format(j * i) + " ");
                }
            }
            System.out.println();
        }
    }
}