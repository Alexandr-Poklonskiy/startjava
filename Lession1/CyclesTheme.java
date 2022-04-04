public class CyclesTheme {
    public static void main(String[] args) {
        // 1. Подсчет суммы четных и нечетных чисел.
        System.out.println("1. Подсчет суммы четных и нечетных чисел.");
        int num1 = -10;
        int num2 = 21;
        int countEven = 0;
        int countOdd = 0;
        do {
            if(num1 % 2 == 0) {
                countEven += num1;
            }else{
                countOdd += num1;
            }
            num1++;
        }while(num1 <= num2);
        System.out.println("Сумма чётных чисел: " + countEven + ". Сумма нечетных: " + countOdd + ".");

        // 2. Вывод чисел между max и min.
        System.out.println("\n2. Вывод чисел между max и min.");
        num1 = 1;
        num2 = 5;
        int num3 = 10;
        int maxN = 0;
        int minN = 0;
        if(num1 > num2) {
            if(num1 > num3){
                maxN = num1;
                if(num2 > num3){
                    minN = num3;
                }else{
                minN = num2;
                }
            }
        }else if(num2 > num3) {
            maxN = num2;
                if(num1 > num3) {
                minN = num3;
                }else{
                minN = num1;
                }
        }else{
            maxN = num3;
            minN = num1;
        }
        System.out.println(maxN + " " + minN);

    }
}