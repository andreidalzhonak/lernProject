package lesson1;

public class Lesson1_2 {
    public void checkSumSign() {
        int a = 15;
        int b = -20;
        int sum = (a + b);
        if (sum >= 0) System.out.println("Сумма положительная");
        if (sum <= 0) System.out.println("Сумма отрицательная");
    }

    public static void main(String[] args) {
        Lesson1_2 print = new Lesson1_2();
        print.checkSumSign();
    }
}
