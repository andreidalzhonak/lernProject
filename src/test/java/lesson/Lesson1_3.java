package lesson;

public class Lesson1_3 {
    public void printColor() {
        int value = -101;
        if (value <= 0) System.out.println("Красный");
        if (value > 0 & value <= 100) System.out.println("Желтый");
        if (value > 100) System.out.println("Зеленый");
    }

    public static void main(String[] args) {
        Lesson1_3 print = new Lesson1_3();
        print.printColor();
    }
}
