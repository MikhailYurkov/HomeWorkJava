package JavaStage2.Lesson1;


    public class Robot {
        private String name;
        private double maxHeight;      // ������������ ������ �� �� ������� ����� ��������� ��������
        private int maxRun;         // ���������� ���������� ������������ ���� ���������

        public Robot(String name, double maxHeight, int maxRun) {
            this.name = name;
            this.maxHeight = maxHeight;
            this.maxRun = maxRun;
        }

        public void run(int distance){
            System.out.println("����� �������� " + distance);
        }

        public void jump(double height){
            System.out.println("����� ���������� �� " + height +"�.");
        }

        public String getName() {
            return name;
        }

        public double getMaxHeight() {
            return maxHeight;
        }

        public int getMaxRun() {
            return maxRun;
        }
    }