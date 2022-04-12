public class Person {

    String name = "Александр"
    String sex = "Мужской"
    byte age = 38;
    byte weight = 68;
    short height = 181;
    byte anxietyLevel = 0;

    void learnNewThemeJava() {
        System.out.println("Учу новую тему!");
        anxietyLevel+= 3;
    }
    viod doHomeWork() {
        anxietyLevel += 5;
        System.out.println("Делаю домашнюю работу...");
    }
    void waitResult() {
        anxietyLevel += 10;
        System.out.println("Жду результата проверки...");
    }
    viod homeWorkDone() {
        anxietyLevel -= 10;
        System.out.println("Всё сделал, можно двигаться дальше!");
    }
    void walkInPark() {
        System.out.println("Гуляю в парке!");
        anxietyLevel -= 3;
    }
    void playGuitar() {
        System.out.println("Играю на гитаре.");
        anxietyLevel -= 1;
    }
    void eatBeforeSleep() {
        System.out.println("Ем перед сном");
        anxietyLevel -= 2;
        weight++;
    }
    void celebrateBD() {
        System.out.println("Праздную день рождения!!!");
        age++;
    }

}