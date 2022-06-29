package HW7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Kot", 50), new Cat("Barsik", 50), new Cat("Klubok", 25), new Cat("Kot2", 5), new Cat("Kottrip", 1)};

        Plate plate = new Plate(110);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();

        }
    }
}

