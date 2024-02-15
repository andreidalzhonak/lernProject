package lesson2;

public class Lesson2_2 {
    public void checkSumSign() {
        int a = 15;
        int b = -20;
        int sum = (a + b);
        if (sum >= 0) System.out.println("Сумма положительная");
        if (sum <= 0) System.out.println("Сумма отрицательная");
    }

    public static void main(String[] args) {
        Lesson2_2 print = new Lesson2_2();
        print.checkSumSign();
    }
}
