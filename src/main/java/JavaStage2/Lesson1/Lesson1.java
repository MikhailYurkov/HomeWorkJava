package JavaStage2.Lesson1;


public class Lesson1 {
    public static void main(String[] args) {
        String nameParticipant = "";
        String nameObstacle;
        //задание №1,2,3 и 4 "бег с препятствиями"
        System.out.println("\n \"Бег с препятствиями\"...");
        //создаем массив объектов (участников забега)
        Object[] participants = new Object[9];
        participants[0] = new Cat("Мурзик (старый)", 2.1, 400);
        participants[1] = new Cat("Барсик", 2.2, 4000);
        participants[2] = new Cat("Кекс", 3.1, 15000);
        participants[3] = new Human("Майор Деревянко", 2.1, 3000);
        participants[4] = new Human("Лейтенант Летяга", 2.2, 5000);
        participants[5] = new Human("Рядовой Непромах", 2.5, 10000);
        participants[6] = new Robot("R2-D2", 1.8, 15000);
        participants[7] = new Robot("C-3PO", 1.3, 5000);
        participants[8] = new Robot("K-2SO", 2.5, 10000);
        // Создаем массив препятствий (решил сделать их в перемешку)
        Object[] obstacles = new Object[6];
        obstacles[0] = new Road("забег по прямой ", 500);
        obstacles[1] = new Wall("Малая стенка", 1.2);
        obstacles[2] = new Road("дорога - асфальт ", 3000);
        obstacles[3] = new Wall("Средняя стенка", 1.8);
        obstacles[4] = new Road("булыжник ", 1000);
        obstacles[5] = new Wall("Высокая стенка", 2.3);
        // погнали...
        System.out.println("Тренировочный забег смешанного типа: Коты, Люди, Роботы");

        for (Object participant : participants) {
            int vMaxRun = 0;        //возможность бежать
            double vMaxHeight = 0;  //возможность прыгать

            System.out.print("На полосу препятствий выходит ");
            if (participant instanceof Cat) {
                nameParticipant = ((Cat) participant).getName();
                vMaxRun = ((Cat) participant).getMaxRun();
                vMaxHeight = ((Cat) participant).getMaxHeight();
            }
            if (participant instanceof Human) {
                nameParticipant = ((Human) participant).getName();
                vMaxRun = ((Human) participant).getMaxRun();
                vMaxHeight = ((Human) participant).getMaxHeight();
            }
            if (participant instanceof Robot) {
                nameParticipant = ((Robot) participant).getName();
                vMaxRun = ((Robot) participant).getMaxRun();
                vMaxHeight = ((Robot) participant).getMaxHeight();
            }

            System.out.println(nameParticipant + " ТТХ: бег " + vMaxRun + " прыжок " + vMaxHeight);
            boolean failure = false;
            System.out.print("СТАРТ!   ");
            for (int y = 0; y < obstacles.length; y++) {
                int tRun = 0;
                double tHeight = 0;
                if (obstacles[y] instanceof Road) {
                    nameObstacle = ((Road) (obstacles[y])).getName();
                    tRun = ((Road) (obstacles[y])).getDistance();
                    if (tRun > vMaxRun) {
                        System.out.println(" Участник: " + nameParticipant + " сошел с дистанции на препятствии №" +
                                (y + 1) + " " + nameObstacle + "(" + tRun + "м.) \n");
                        failure = true;
                        break;
                    }
                }
                if (obstacles[y] instanceof Wall) {
                    nameObstacle = ((Wall) (obstacles[y])).getName();
                    tHeight = ((Wall) (obstacles[y])).getHeight();
                    if (tHeight > vMaxHeight) {
                        System.out.println(" Участник: " + nameParticipant + " сошел с дистанции на препятствии №" +
                                (y + 1) + " " + nameObstacle + "(" + tHeight + "м.) \n");
                        failure = true;
                        break;
                    }

                }
            }
            if (!failure) {
                System.out.println(" Участник: " + nameParticipant + " успешно выдержал все испытания!!!\n\n");
            }
        }
    }
}
