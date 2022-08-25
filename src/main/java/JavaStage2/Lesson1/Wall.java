package JavaStage2.Lesson1;

public class Wall  {
    private String name;        // наименование препятствия или его порядковый номер, на будущее.
    private double height;      // высота стенки.

    public Wall(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Стенка (" + name + ") высотой: " + height +"м.";
    }
}