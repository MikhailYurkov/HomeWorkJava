package JavaStage2.Lesson1;


public class Lesson1 {
    public static void main(String[] args) {
        String nameParticipant = "";
        String nameObstacle;
        //������� �1,2,3 � 4 "��� � �������������"
        System.out.println("\n \"��� � �������������\"...");
        //������� ������ �������� (���������� ������)
        Object[] participants = new Object[9];
        participants[0] = new Cat("������ (������)", 2.1, 400);
        participants[1] = new Cat("������", 2.2, 4000);
        participants[2] = new Cat("����", 3.1, 15000);
        participants[3] = new Human("����� ���������", 2.1, 3000);
        participants[4] = new Human("��������� ������", 2.2, 5000);
        participants[5] = new Human("������� ��������", 2.5, 10000);
        participants[6] = new Robot("R2-D2", 1.8, 15000);
        participants[7] = new Robot("C-3PO", 1.3, 5000);
        participants[8] = new Robot("K-2SO", 2.5, 10000);
        // ������� ������ ����������� (����� ������� �� � ���������)
        Object[] obstacles = new Object[6];
        obstacles[0] = new Road("����� �� ������ ", 500);
        obstacles[1] = new Wall("����� ������", 1.2);
        obstacles[2] = new Road("������ - ������� ", 3000);
        obstacles[3] = new Wall("������� ������", 1.8);
        obstacles[4] = new Road("�������� ", 1000);
        obstacles[5] = new Wall("������� ������", 2.3);
        // �������...
        System.out.println("������������� ����� ���������� ����: ����, ����, ������");

        for (Object participant : participants) {
            int vMaxRun = 0;        //����������� ������
            double vMaxHeight = 0;  //����������� �������

            System.out.print("�� ������ ����������� ������� ");
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

            System.out.println(nameParticipant + " ���: ��� " + vMaxRun + " ������ " + vMaxHeight);
            boolean failure = false;
            System.out.print("�����!   ");
            for (int y = 0; y < obstacles.length; y++) {
                int tRun = 0;
                double tHeight = 0;
                if (obstacles[y] instanceof Road) {
                    nameObstacle = ((Road) (obstacles[y])).getName();
                    tRun = ((Road) (obstacles[y])).getDistance();
                    if (tRun > vMaxRun) {
                        System.out.println(" ��������: " + nameParticipant + " ����� � ��������� �� ����������� �" +
                                (y + 1) + " " + nameObstacle + "(" + tRun + "�.) \n");
                        failure = true;
                        break;
                    }
                }
                if (obstacles[y] instanceof Wall) {
                    nameObstacle = ((Wall) (obstacles[y])).getName();
                    tHeight = ((Wall) (obstacles[y])).getHeight();
                    if (tHeight > vMaxHeight) {
                        System.out.println(" ��������: " + nameParticipant + " ����� � ��������� �� ����������� �" +
                                (y + 1) + " " + nameObstacle + "(" + tHeight + "�.) \n");
                        failure = true;
                        break;
                    }

                }
            }
            if (!failure) {
                System.out.println(" ��������: " + nameParticipant + " ������� �������� ��� ���������!!!\n\n");
            }
        }
    }
}
