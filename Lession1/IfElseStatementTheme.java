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
        }else{
            System.out.println("Молодо - зелено.");
        }

        if(!male) { // Тут что то не так...
            System.out.println("С 8 марта!!!");
        }

        if(height < 1.80){
            System.out.println("Рост меньше 1.80 м.");
        }else{
            System.out.println("Рост больше или равен 1.80 м.");
        }

        if(firstLetterOfName == 'M') {
            System.out.println("Первая буква вашего имени 'M'");
        }else if(firstLetterOfName == 'I') {
            System.out.println("Первая буква вашего имени 'I'");
        }else{
            System.out.println("Первая буква вашего имени не 'M' и не 'I'");
        }

        // 2. Поиск максимального и минимального числа
        System.out.println("\n2. Поиск максимального и минимального числа");
        int x = 3;
        int y = 5;
        if(x > y) {
            System.out.println(x + " максимальное число, " + y + " минимальное.");
        }else{
            System.out.println(y + " максимальное число, " + x + " минимальное.");
        }

        // 3. Работа с числом
        System.out.println("\n3. Работа с числом");
        int number = 15;
        if(number % 2 == 0) {
            System.out.println("Число чётное.");
        }else{
            System.out.println("Число нечётное");
        }

        if(number > 0) {
            System.out.println("Число положительное.");
        }else if(number < 0) {
            System.out.println("Число отрицательное.");
        }else{
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
        if((firstN1 == firstN2) || (secondN1 ==secondN2) || (thirdN1 == thirdN2)) {
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
        }else{
            System.out.println("Числа не совподают.");
        }

        // 5. Определение буквы, числа или символа по их коду
        // Кажется я тут наворотил какую-то дичь, но вроде работает...
        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char unknown = '\u005A';
        if(unknown < '\u0030') {
            System.out.println("Это символ " + unknown);
        }else if(unknown < '\u003A') {
            System.out.println("Это цифра " + unknown);
        }else if( unknown < '\u0041') {
            System.out.println("Это буква " + unknown);
        }else if(unknown < '\u0041') {
            System.out.println("Это символ " + unknown);
        }else if(unknown < '\u005B') {
            System.out.println("Это буква " + unknown);
        }else if(unknown < '\u0061') {
            System.out.println("Это символ " + unknown);
        }else if(unknown < '\u007B') {
            System.out.println("Это буква " + unknown);
        }else if(unknown <= '\u007F') {
            System.out.println("Это символ " + unknown);
        }else{
            System.out.println("Вы сломали пространственно-временной континуум.");
        }

        // 6. Определение суммы вклада и начисленных банком %
        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        double deposit = 300000;
        double rate;
        double profit;
        if(deposit < 100000) {
            rate = 5;
            profit = deposit * 0.05;
        }else if(deposit < 300000) {
            rate = 7;
            profit = deposit * 0.07;
        }else{
            rate = 10;
            profit = deposit * 0.1;
        }
        System.out.println("Сумма вклада: " + deposit + ". Начисленно " + rate + "%. Итоговая сумма: " + (deposit + profit));

        // 7. Определение оценки по предметам
        System.out.println("\n7. Определение оценки по предметам");
        int percScoreHistory = 59;
        int rercScoreProgramming = 91;
        int pointsHistory;
        int pointsProgramming;

        if(percScoreHistory > 91) {
            pointsHistory = 5;
        }else if(percScoreHistory > 73){
            pointsHistory = 4;
        }else if(percScoreHistory >60){
            pointsHistory = 3;
        }else{
            pointsHistory = 2;
        }

        if(rercScoreProgramming > 91) {
            pointsProgramming = 5;
        }else if(rercScoreProgramming > 73){
            pointsProgramming = 4;
        }else if(rercScoreProgramming >60){
            pointsProgramming = 3;
        }else{
            pointsProgramming = 2;
        }

        int averScore = (percScoreHistory + rercScoreProgramming) / 2;
        int averPoints = (pointsHistory + pointsProgramming) / 2;
        System.out.println("История: " + pointsHistory + " Программирование: " + pointsProgramming);
        System.out.println("Средний балл оценок по предметам " + averPoints);
        System.out.println("Средний % по предметам " + averScore);

        // 8. Расчет прибыли (убытка)
        System.out.println("\n8. Расчет прибыли (убытка)");
        int rent = 5000;
        int averRevenue = 15000;
        int costPrice = 9000;
        int estimatedIncome = (averRevenue - rent - costPrice) * 12;
        if(estimatedIncome > 0) {
            System.out.println("Предполагаемая прибыль за год: +" + estimatedIncome);
        }else if(estimatedIncome < 0) {
            System.out.println("Предполагаемый убыток за год: " + estimatedIncome);
        }else{
            System.out.println("Бублик с дыркой.");
        }

    }
}