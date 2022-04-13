public class WolfTest {
    public static void main(String[] args) {
        Wolf alfa = new Wolf("Акелла");

        alfa.age = 10;
        alfa.sex = "кабель";
        alfa.weight = 62.8f;
        alfa.color = "серый";

        System.out.println("Кличка " + alfa.name + "\nПол " + alfa.sex + "\nВозраст " + alfa.age + "\nВес " + alfa.weight + "\nЦвет " + alfa.color);

        alfa.say();
        alfa.run();
        alfa.jump();
        alfa.missed();
    }
}