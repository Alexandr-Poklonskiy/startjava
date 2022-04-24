package com.startjava.lession1.variables;

public class VariablesTheme {
    public static void main(String[] args) {
        // 1. Создание переменных и вывод их значений на консоль.
        System.out.println("1. Создание переменных и вывод их значений на консоль.");
        
        byte numCores = 8;
        short memory = 32;
        int cpuFrequency = 3700;
        long gpuFrequency = 1900L;
        float dramFrequency = 1596.8F;
        double driverVersion = 512.15;
        char firstLetterUser = 'A';
        boolean isMyComputerCool = true;

        System.out.println("Количество ядер: " + numCores);
        System.out.println("Оперативная память: " + memory);
        System.out.println("Частота процессора: " + cpuFrequency);
        System.out.println("Частота графического процессора: " + gpuFrequency);
        System.out.println("Частота оперативной памяти: " + dramFrequency);
        System.out.println("Версия графического драйвера: " + driverVersion);
        System.out.println("Первая буква имени пользователя: " + firstLetterUser);
        System.out.println("Мой компьютер клёвый? " + isMyComputerCool);

        // 2. Расчет стоимости товара со скидкой
        System.out.println("\n2. Расчет стоимости товара со скидкой");

        int sugar = 100;
        int buckwheat = 200;
        double discount = (sugar + buckwheat) * 0.11;
        double finalPrice = sugar + buckwheat - discount;

        System.out.println("Сумма скидки " + discount);
        System.out.println("Стоимость товаров со скидкой " + finalPrice);

        // 3. Вывод на консоль слова JAVA
        System.out.println("\n3. Вывод на консоль слова JAVA");

        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a   ");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        // 4. Отображение min и max значений числовых типов данных
        System.out.println("\n4. Отображение min и max значений числовых типов данных");

        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;
        float floatMax = 3.4028235E38F;
        double doubleMax = 1.7976931348623157E308;

        System.out.println("byte " + byteMax);
        System.out.println("short " + shortMax);
        System.out.println("int " + intMax);
        System.out.println("long " + longMax);
        System.out.println("float " + floatMax);
        System.out.println("double " + doubleMax);

        System.out.println("Инкремент");
        System.out.println(++byteMax);
        System.out.println(++shortMax);
        System.out.println(++intMax);
        System.out.println(++longMax);
        System.out.println(++floatMax);
        System.out.println(++doubleMax);

        System.out.println("Декремент");
        System.out.println(--byteMax);
        System.out.println(--shortMax);
        System.out.println(--intMax);
        System.out.println(--longMax);
        System.out.println(--floatMax);
        System.out.println(--doubleMax);


        // 5. Перестановка значений переменных
        System.out.println("\n5. Перестановка значений переменных");
        double pi = 3.1415;
        double phi = 1.6180;
        System.out.println("Число Pi = " + pi + "; Число Phi = " + phi    + ";");
        double change = pi;
        pi = phi;
        phi = change;
        System.out.println("Вселенная сломалась, теперь число Pi = " + pi + "; Число Phi = " + phi + ";");

        // 6. Вывод символов и их кодов
        System.out.println("\n6. Вывод символов и их кодов");
        int a = 35;
        int b = 38;
        int c = 64;
        int d = 94;
        int e = 95;

        System.out.println(a + "-" + (char) a);
        System.out.println(b + "-" + (char) b);
        System.out.println(c + "-" + (char) c);
        System.out.println(d + "-" + (char) d);
        System.out.println(e + "-" + (char) e);

        // 7. Произведение и сумма цифр числа
        System.out.println("\n7. Произведение и сумма цифр числа");
        int srcNum = 345;
        System.out.println("Число " + srcNum);
        int thirdN = srcNum % 10;
        int secondN = srcNum / 10 % 10;
        int firstN = srcNum / 100;
        int sum = firstN + secondN + thirdN;
        int mult = firstN * secondN * thirdN;
        System.out.println("Сумма цифр числа равна: " + sum);
        System.out.println("Произведение цифр числа равно: " + mult);

        // 8. Вывод на консоль ASCII-арт Дюка
        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        char sp = ' ';
        char sl = '/';
        char bsl = '\\';
        char oBkt = '(';
        char cBkt = ')';
        char und = '_';
        System.out.println("" + sp + sp + sp + sp + sl + bsl + sp + sp + sp + sp);
        System.out.println("" + sp + sp + sp + sl + sp + sp + bsl + sp + sp + sp);
        System.out.println("" + sp + sp + sl + und + oBkt + sp + cBkt + bsl + sp + sp);
        System.out.println("" + sp + sl + sp + sp + sp + sp + sp + sp + bsl);
        System.out.println("" + sl + und + und + und + und + sl + bsl + und + und + bsl);

        // 9. Отображение количества сотен, десятков и единиц числа
        System.out.println("\n9. Отображение количества сотен, десятков и единиц числа ");
        srcNum = 123;
        int hundreds = srcNum / 100;
        int tens = srcNum / 10 % 10;
        int units = srcNum % 10;
        System.out.println("Сотни: " + hundreds);
        System.out.println("Десятки: " + tens);
        System.out.println("Еденицы: " + units);
        

        // 10. Преобразование секунд
        System.out.println("\n10. Преобразование секунд");
        int srcSec = 86399;
        int hours = srcSec / 3600;
        int minutes = srcSec % 3600 / 60;
        int seconds = srcSec % 60;
        System.out.println("Время в формате ЧЧ:ММ:СС " + hours + ":" + minutes + ":" + seconds);
    }    
}
