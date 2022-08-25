package JavaStage2.Lesson1;

public class Road  {
    private String name;        // наименование препятствия или его порядковый номер, на будущее.
    private int distance;       // протяженность.

    public Road(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Беговая дорожка (" + name + " забег на дистанцию: " + distance +"м.";
    }
}