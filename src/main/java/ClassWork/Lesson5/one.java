package ClassWork.Lesson5;

public class one {
    public static void main(String[] args) {
        int paymant = 0;
        int count = 21;
        int sum = paymant;

        for (int i = 0; i < count; i++) {
            paymant = paymant + 100;
            sum = paymant + sum;

            System.out.print((i + 1) + " ������: ");
            System.out.println(sum);
            System.out.println("������: " + paymant);

        }
        System.out.println("___");
        System.out.println("����� ����������: " + sum);
    }
}
