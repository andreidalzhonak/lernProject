package lesson2;

public class Lesson2_3 {

  int value = 101;

  public void printColor() {

    if (value <= 0) {
      System.out.println("Красный");
    } else if (value > 0 & value <= 100) {
      System.out.println("Желтый");
    } else {
      System.out.println("Зеленый");
    }
  }

  public static void main(String[] args) {
    Lesson2_3 print = new Lesson2_3();
    print.printColor();
  }
}
