import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    Player player1;
    Player player2;
    int secretNumber;
    String answer;
    Random random = new Random();

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    void startGame() {
        do {
            secretNumber = random.nextInt(100);
            System.out.println("Компьютер загадал число от 0 до 100. Отгадайте!");
            while(true) {
                System.out.println(player1.getName() + " Твой ход!");
                player1.enterNumber();
                if(player1.getNumber() > secretNumber) {
                    System.out.println("Данное число больше того, что загадал компьютер");
                } else if (player1.getNumber() < secretNumber) {
                    System.out.println("Данное число меньше того, что загадал компьютер");
                } else {
                    break;
                }
                System.out.println(player2.getName() + " Твой ход!");
                player2.enterNumber();
                if(player2.getNumber() > secretNumber) {
                    System.out.println("Данное число больше того, что загадал компьютер");
                } else if (player2.getNumber() < secretNumber) {
                    System.out.println("Данное число меньше того, что загадал компьютер");
                } else {
                    break;
                }
            }
            if(player1.getNumber() == secretNumber) {
                System.out.println(player1.getName() + " ты великолепен! Загаданное число " + secretNumber);
            } else {
                System.out.println(player2.getName() + " ты великолепен! Загаданное число " + secretNumber);
            }
            do {
                Scanner scan = new Scanner(System.in);
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = scan.nextLine();
            } while(!(answer.equals("no")) & !(answer.equals("yes")));
        } while(answer.equals("yes"));
    }
}