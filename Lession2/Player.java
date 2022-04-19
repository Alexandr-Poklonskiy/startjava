import java.util.Scanner;

public class Player {
    Scanner scan = new Scanner(System.in);
    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    void enterNumber() {
        number = scan.nextInt();
    }
}