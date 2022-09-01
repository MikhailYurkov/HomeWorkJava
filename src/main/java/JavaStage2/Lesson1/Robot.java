package JavaStage2.Lesson1;


    public class Robot {
        private String name;
        private double maxHeight;      // максимальна€ высота на на которую может подн€тьс€ участник
        private int maxRun;         // предельное рассто€ние непрерывного бега участника

        public Robot(String name, double maxHeight, int maxRun) {
            this.name = name;
            this.maxHeight = maxHeight;
            this.maxRun = maxRun;
        }

        public void run(int distance){
            System.out.println("–обот пробежал " + distance);
        }

        public void jump(double height){
            System.out.println("–обот подпрыгнул на " + height +"м.");
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