package com.startjava.lession1.ifelse;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        // 1. Перевод псевдокода на язык Java
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 38;
        double height = 1.81;
        String name = "Alexandr";
        boolean male = true;
        char firstLetterOfName = name.charAt(0);
        if(age > 20) {
            System.out.println("Старость - не радость.");
        } else {
            System.out.println("Молодо - зелено.");
        }

        if(!male) { // Тут что то не так...
            System.out.println("С 8 марта!!!");
        }

        if(height < 1.80) {
            System.out.println("Рост меньше 1.80 м.");
        } else {
            System.out.println("Рост больше или равен 1.80 м.");
        }

        if(firstLetterOfName == 'M') {
            System.out.println("Первая буква вашего имени 'M'");
        } else if(firstLetterOfName == 'I') {
            System.out.println("Первая буква вашего имени 'I'");
        } else {
            System.out.println("Первая буква вашего имени не 'M' и не 'I'");
        }

        // 2. Поиск максимального и минимального числа
        System.out.println("\n2. Поиск максимального и минимального числа");
        int x = 3;
        int y = 5;
        if(x > y) {
            System.out.println(x + " максимальное число, " + y + " минимальное.");
        } else {
            System.out.println(y + " максимальное число, " + x + " минимальное.");
        }

        // 3. Работа с числом
        System.out.println("\n3. Работа с числом");
        int number = 15;
        if(number % 2 == 0) {
            System.out.println("Число чётное.");
        } else {
            System.out.println("Число нечётное");
        }

        if(number > 0) {
            System.out.println("Число положительное.");
        } else if(number < 0) {
            System.out.println("Число отрицательное.");
        } else {
            System.out.println("Это ноль");
        }

        // 4. Поиск общей цифры в числах
        System.out.println("\n4. Поиск общей цифры в числах");
        int srcNum1 = 698;
        int srcNum2 = 398;
        int thirdN1 = srcNum1 % 10;
        int secondN1 = srcNum1 / 10 % 10;
        int firstN1 = srcNum1 / 100;
        int thirdN2 = srcNum2 % 10;
        int secondN2 = srcNum2 / 10 % 10;
        int firstN2 = srcNum2 / 100;
        if((firstN1 == firstN2) || (secondN1 == secondN2) || (thirdN1 == thirdN2)) {
            System.out.println("Числа совпадают: ");
            if(firstN1 == firstN2) {
                System.out.println("В первом разраде: " + firstN1);
            }
            if(secondN1 ==secondN2) {
                System.out.println("Во втором разраде: " + secondN1);
            }
            if(thirdN1 == thirdN2) {
                System.out.println("В третьем разраде: " + thirdN1);
            }
        } else {
            System.out.println("Числа не совподают.");
        }

        // 5. Определение буквы, числа или символа по их коду
        // Кажется я тут наворотил какую-то дичь, но вроде работает...
        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char unknownChar = '\u0056';
        if((unknownChar > '\u002F') && (unknownChar < '\u003A')) {
            System.out.println("Это цифра " + unknownChar);
        } else if((unknownChar > '\u0040') && (unknownChar < '\u005B') || ((unknownChar > '\u0060') && (unknownChar < '\u007B'))) {
            System.out.println("Это буква " + unknownChar);
        } else {
            System.out.println("Это символ " + unknownChar);
        }

        // 6. Определение суммы вклада и начисленных банком %
        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        double deposit = 300000;
        double rate;
        if(deposit < 100000) {
            rate = 5;
        } else if(deposit < 300000) {
            rate = 7;
        } else {
            rate = 10;
        }
        double profit = rate / 100 * deposit;
        System.out.println("Сумма вклада: " + deposit + ". Начисленно " + rate + "%. Итоговая сумма: " + (deposit + profit));

        // 7. Определение оценки по предметам
        System.out.println("\n7. Определение оценки по предметам");
        int percScoreHistory = 59;
        int rercScoreProgramming = 91;
        int pointsHistory;
        int pointsProgramming;

        if(percScoreHistory > 91) {
            pointsHistory = 5;
        } else if(percScoreHistory > 73) {
            pointsHistory = 4;
        } else if(percScoreHistory >60) {
            pointsHistory = 3;
        } else {
            pointsHistory = 2;
        }

        if(rercScoreProgramming > 91) {
            pointsProgramming = 5;
        } else if(rercScoreProgramming > 73) {
            pointsProgramming = 4;
        } else if(rercScoreProgramming >60) {
            pointsProgramming = 3;
        } else {
            pointsProgramming = 2;
        }

        System.out.println("История: " + pointsHistory + " Программирование: " + pointsProgramming);
        System.out.println("Средний балл оценок по предметам " + ((pointsHistory + pointsProgramming) / 2));
        System.out.println("Средний % по предметам " + ((percScoreHistory + rercScoreProgramming) / 2));

        // 8. Расчет прибыли (убытка)
        System.out.println("\n8. Расчет прибыли (убытка)");
        int rent = 5000;
        int averRevenue = 15000;
        int costPrice = 9000;
        int estimatedIncome = (averRevenue - rent - costPrice) * 12;
        if(estimatedIncome > 0) {
            System.out.println("Предполагаемая прибыль за год: +" + estimatedIncome);
        } else if(estimatedIncome < 0) {
            System.out.println("Предполагаемый убыток за год: " + estimatedIncome);
        } else {
            System.out.println("Бублик с дыркой.");
        }

        // 9. Определение существования треугольника
        System.out.println("\n9. Определение существования треугольника");
        /*В условии нужно проверить существование прямоугольного треугольника.
        В таком треугольнике квадрат гипотенузы равен сумме квадратов катетов.
        Следовательно нужно найти большую сторону и проверить это равентсво.*/
        int a = 3;
        int b = 4;
        int c = 5;
        // не понимаю, почему если не проинициализировать эти переменные, при компиляции возникает ошибка
        int gip = 0;
        int cat1 = 0;
        int cat2 = 0;
        if(a > b) {
            if(a > c) {
                gip = a;
                cat1 = b;
                cat2 = c;
            }
        } else if(b > c) {
            gip = b;
            cat1 = a;
            cat2 = c;
        } else {
            gip = c;
            cat1 = a;
            cat2 = b;
        }

        if(gip * gip == cat1 * cat1 + cat2 * cat2) {
            System.out.println("Это прямоугольный треугольник.\nГипотенуза " + gip + "\nКатеты " + cat1 + " " + cat2 + "\nПлощадь треугольника равна " + (cat1 * cat2 / 2));
            System.out.println("|\\");
            System.out.println("| \\");
            System.out.println("|  \\");
            System.out.println("|___\\");

        } else {
            System.out.println("Прямоугольного треугольника с такими сторанами не существует.");
        }


        // 10. Подсчет количества банкнот
        System.out.println("\n10. Подсчет количества банкнот");
        int sum = 567;
        int numBank50 = sum / 50;
        int numBank10 = sum % 50 / 10;
        int numBank1 = sum % 10;
        int revSum = numBank50 * 50 + numBank10 * 10 + numBank1;
        System.out.println("Для получения суммы " + revSum + " понадобиться:" + "\nбанкнот номиналом 50: " + numBank50 + "\nбанкнот номиналом 10: " + numBank10 + "\nбонкнот номиналом 1: " + numBank1);
    }
}
