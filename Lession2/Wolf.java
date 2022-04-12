public class Wolf {

    String name;
    String sex;
    String color;
    byte age;
    float weight;

    public Wolf(String name) {
        this.name = name;
    }

    void jump() {
        System.out.println("Прыгает.");
    }
    void run() {
        System.out.println("Бежит.");
    }
    void eat() {
        System.out.println("Ест.");
    }
    void bite() {
        System.out.println("Кусает за бочок.");
    }
    void missed() {
        System.out.println(name + " промахнулся.");
    }
    void say() {
        System.out.println("Мы с тобой одной крови!");
    }
}