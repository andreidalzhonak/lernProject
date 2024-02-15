package lesson2;

public class Lesson2_3 {
    public void printColor() {
        int value = -101;
        if (value <= 0) System.out.println("Красный");
        if (value > 0 & value <= 100) System.out.println("Желтый");
        if (value > 100) System.out.println("Зеленый");
    }

    public static void main(String[] args) {
        Lesson2_3 print = new Lesson2_3();
        print.printColor();
    }
}
