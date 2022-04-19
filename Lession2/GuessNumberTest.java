import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Первый игрок, введи своё имя");
        Player player1 = new Player(scan.nextLine());
        System.out.println("Второй игрок, введи своё имя");
        Player player2 = new Player(scan.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        game.startGame();
    }
}