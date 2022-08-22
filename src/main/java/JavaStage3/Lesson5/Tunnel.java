package JavaStage3.Lesson5;

import java.util.concurrent.Semaphore;

import static JavaStage3.Lesson5.Lesson5.HALF_CARS_COUNT;

public class Tunnel extends Stage {
    Semaphore smp = new Semaphore(HALF_CARS_COUNT);

    public Tunnel() {
        this.length = 80;
        this.description = "������� " + length + " ������";
    }

    @Override
    public void go(Car c) {
        try {
            try {
                System.out.println(c.getName() + " ��������� � �����(����): " + description);
                smp.acquire();
                System.out.println(c.getName() + " ����� ����: " + description);
                Thread.sleep(length / c.getSpeed() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(c.getName() + " �������� ����: " + description);
                smp.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}