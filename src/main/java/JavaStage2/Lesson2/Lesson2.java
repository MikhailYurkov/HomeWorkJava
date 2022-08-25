package JavaStage2.Lesson2;

public class Lesson2 {

    private static String[][] srt1 = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}}; // Тестовый массив с неверным размером

    private static String[][] srt2 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "Десять", "11", "12"}, {"13", "14", "15", "16"}}; // тестовый массив с неконвертируемым значением

    private static String[][] srt3 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}}; // тестовый массив правильный


    public static void main(String[] args) {
        System.out.println("\n Обрабатываем массив srt3:");
        try {
            System.out.println("Сумма всех элементов массива str3 = " + MethodEx(srt3));
        } catch (ArrayDataException | ArraySizeException e) {
            System.out.println(e);
            System.out.println("результат расчета суммы получен быть не может");
        }
        System.out.println("\n Обрабатываем массив srt2:");
        try {
            System.out.println("Сумма всех элементов массива str2 = " + MethodEx(srt2));
        } catch (ArrayDataException | ArraySizeException e) {
            System.out.println(e);
            System.out.println("результат расчета суммы получен быть не может");
        }
        System.out.println("\n Обрабатываем массив srt1:");
        try {
            System.out.println("Сумма всех элементов массива str1 = " + MethodEx(srt1));
        } catch (ArrayDataException | ArraySizeException e) {
            System.out.println(e);
            System.out.println("результат расчета суммы получен быть не может");
        }
    }

    public static int MethodEx(String[][] srt) throws RuntimeException {
        int sum = 0;
        if (srt.length != 4 || srt[0].length != 4)
            throw new ArraySizeException(("Массив не соответствует размерности 4х4!"));
        for (int i = 0; i < srt.length; i++) {
            for (int j = 0; j < srt[i].length; j++) {
                try {
                    sum += Integer.parseInt(srt[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("В переданном массиве элемент с Array[" + i + "][" + j + "] НЕ может быть конвертирован в число!!!");
                }
            }
        }
        return sum;
    }
}
