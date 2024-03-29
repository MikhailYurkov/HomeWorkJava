package HW7;


public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;


    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    void eat(Plate plate) {
        if (hungry && plate.decreaseFood(appetite))
            hungry = false;
    }

    void info() {
        String isHungry = !hungry ? "сыт" : "голоден";
        System.out.println(name + ": " + isHungry);
    }
}
