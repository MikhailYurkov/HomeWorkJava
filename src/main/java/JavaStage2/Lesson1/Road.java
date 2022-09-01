package JavaStage2.Lesson1;

public class Road  {
    private String name;        // ������������ ����������� ��� ��� ���������� �����, �� �������.
    private int distance;       // �������������.

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
        return "������� ������� (" + name + " ����� �� ���������: " + distance +"�.";
    }
}