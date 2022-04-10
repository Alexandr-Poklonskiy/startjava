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
            } else {
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
        int maxN = num1;
        int minN = num2;
        if(num1 > num2) {
            if(num1 > num3) {
                if(num2 > num3) {
                    minN = num3;
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

        for(int i = --maxN; i > minN; i--) {
            System.out.print(i + " ");
        }

        // 3. Вывод реверсивного числа и суммы его цифр.
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр.");
        int srcNumber = 1234;
        int sum = 0;
        while(srcNumber != 0) {
            int digit = srcNumber % 10;
            sum += digit;
            srcNumber /= 10;
            System.out.print(digit);
        }
        System.out.println("\nСумма чисел: " + sum);

        // 4. Вывод чисел на консоль в несколько строк
        System.out.println("\n4. Вывод чисел на консоль в несколько строк.");
        int count = 0;
        for(int i = 1; i <= 24; i += 2) {
            if(count == 5) {
                System.out.println();
                count = 0;
            }
            System.out.printf("%2d ", i);
            count++;
        }

        for(int i = 1; i <= 5 - count; i++) {
            System.out.printf("%2d ", 0);
        }


        // 5. Проверка количества единиц на четность
        System.out.println("\n5. Проверка количества единиц на четность");
        srcNumber = 3141591;
        int sumOnes = 0;
        while(srcNumber != 0) {
            int digit = srcNumber % 10;
            if(digit == 1) {
                sumOnes += digit;
            }
            srcNumber /= 10;
        }
        if(sumOnes % 2 == 0) {
            System.out.println("Количество единиц чётное число " + sumOnes);
        } else {
            System.out.println("Количество единиц не чётное число " + sumOnes);
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

        i = 0;
        j = 1;
        count = 1;
        do {
            do {
                System.out.print("$");
                j++;
            } while(j <= i);
            System.out.println();
            i++;
            if(i < 3) {
                j = 0;
            } else {
                count *= 2;
                j = count;
            }
        } while(i < 5);

        // 7. Отображение ASCII-символов.
        System.out.println("\n7. Отображение ASCII-символов.");
        System.out.println("Dec Char");
        for(i = 0; i <= 127; i++) {
            System.out.printf("%3d %c%n", i, i);
        }

        // 8. Проверка, является ли число палиндромом.
        System.out.println("\n8. Проверка, является ли число палиндромом.");
        srcNumber = 12321;
        int copySrcNumber = srcNumber;
        int digit = 0;
        while(srcNumber != 0) {
            digit *= 10;
            digit += srcNumber % 10;
            srcNumber /= 10;
        }
        if(copySrcNumber == digit) {
            System.out.println("Число " + copySrcNumber + " является палиндромом.");
        } else {
            System.out.println("Число " + copySrcNumber + " не является палиндромом.");
        }

        // 9. Определение, является ли число счастливым.
        System.out.println("\n9. Определение, является ли число счастливым.");
        srcNumber = 456377;
        int halfSrcNumber = srcNumber / 1000;
        int sumHalfSrcNumber = 0;
        int sumHalfSrcNumber2 = 0;
        for(i = 0; i < 3; i++) {
            digit = srcNumber % 10;
            sumHalfSrcNumber2 += digit;
            srcNumber /= 10;
            digit = halfSrcNumber % 10;
            sumHalfSrcNumber +=  digit;
            halfSrcNumber /= 10;
        }
        if(sumHalfSrcNumber == sumHalfSrcNumber2) {
            System.out.println("Сумма первых трёх чисел равна " + sumHalfSrcNumber + ". Сумма последних " + sumHalfSrcNumber2 + " Число счастливое.");
        } else {
            System.out.println("Сумма первых трёх чисел равна " + sumHalfSrcNumber + ". Сумма последних " + sumHalfSrcNumber2 + " Число не счастливое.");
        }

        // 10. Вывод таблицы умножения Пифагора.
        System.out.println("\n10. Вывод таблицы умножения Пифагора.");
        for (i = 1; i < 10; i++) {
            for(j = 1; j < 10; j++) {
                if(j * i == 1) {
                    System.out.print("   ");
                } else {
                     System.out.printf("%2d ", (j * i));
                }
            }
            System.out.println();
        }
    }
}
