public class VariablesTheme {
    public static void main(String[] args) {

        // Создание переменных и вывод их значений на консоль.
        System.out.println("Создание переменных и вывод их значений на консоль.");
        
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
        System.out.println();

        //Расчет стоимости товара со скидкой
        System.out.println("Расчет стоимости товара со скидкой");

        int sugar = 100;
        int buckwheat = 200;
        double discount = (sugar + buckwheat) * 0.11;
        double finalPrice = sugar + buckwheat - discount;

        System.out.println("Сумма скидки " + discount);
        System.out.println("Стоимость товаров со скидкой " + finalPrice);
        System.out.println();

        // Вывод на консоль слова JAVA
        System.out.println("Вывод на консоль слова JAVA");

        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a   ");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");
        System.out.println();

        // Отображение min и max значений числовых типов данных
        System.out.println("Отображение min и max значений числовых типов данных");

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

        System.out.println("Инкременация");

        byte byteInc = (byte) (byteMax + 1);
        short shortInc = (short) (shortMax + 1);
        int intInc = intMax + 1;
        long longInc = longMax + 1;
        float floatInc = (float) (floatMax + 1); // Не понимаю почему переменные с плавающей точкой
        double doubleInc = doubleMax + 1;        // не поменяли значения ;(

        System.out.println(byteInc);
        System.out.println(shortInc);
        System.out.println(intInc);
        System.out.println(longInc);
        System.out.println(floatInc);
        System.out.println(doubleInc);

        System.out.println("Декременация");

        byte byteDec = (byte) (byteInc - 1);
        short shortDec = (short) (shortInc - 1);
        int intDec = intInc - 1;
        long longDec = longInc - 1;
        float floatDec = (float) (floatInc - 1);
        double doubleDec = doubleInc - 1;

        System.out.println(byteDec);
        System.out.println(shortDec);
        System.out.println(intDec);
        System.out.println(longDec);
        System.out.println(floatDec);
        System.out.println(doubleDec);
        System.out.println();

        //Перестановка значений переменных
        System.out.println("Перестановка значений переменных");
        double pi = 3.1415;
        double phi = 1.6180;
        System.out.println("Число Pi = " + pi + "; Число Phi = " + phi    + ";");
        double change = pi;
        pi = phi;
        phi = change;
        System.out.println("Вселенная сломалась, теперь число Pi = " + pi + "; Число Phi = " + phi + ";");
        System.out.println();

        // Вывод символов и их кодов
        System.out.println("Вывод символов и их кодов");
        int a = 35;
        int b = 38;
        int c = 64;
        int d = 94;
        int e = 95;
        char symbolA = (char) a;
        char symbolB = (char) b;
        char symbolC = (char) c;
        char symbolD = (char) d;
        char symbolE = (char) e;
        System.out.println(a + "-" + symbolA);
        System.out.println(b + "-" + symbolB);
        System.out.println(c + "-" + symbolC);
        System.out.println(d + "-" + symbolD);
        System.out.println(e + "-" + symbolE);
        System.out.println();

        //Произведение и сумма цифр числа
        System.out.println("Произведение и сумма цифр числа");
        int number = 345;
        System.out.println("Число " + number);
        int thirdN = number%10;
        int secondN = number / 10 % 10;
        int firstN = number / 100;
        int sum = firstN + secondN + thirdN;
        int mult = firstN * secondN * thirdN;
        System.out.println("Сумма цифр числа равна: " + sum);
        System.out.println("Произведение цифр числа равно: " + mult);
        System.out.println();

        //Вывод на консоль ASCII-арт Дюка
        System.out.println("Вывод на консоль ASCII-арт Дюка");
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
        System.out.println();

        /*Отображение количества сотен, десятков и единиц числа
        Не понял это задание. Как должен выглядеть результат?
        Вот так?
        100
        20
        3

        Или вот так?
        1
        12
        123*/

        //Преобразование секунд
        System.out.println("Преобразование секунд");
        int nSec = 86399;
        int hours = nSec / 3600;
        int minutes = (nSec - hours * 3600) / 60;
        int seconds = nSec - (hours * 3600) - (minutes * 60);
        System.out.println("Время в формате ЧЧ:ММ:СС " + hours + ":" + minutes + ":" + seconds);
    }    
}
