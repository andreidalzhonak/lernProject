package lesson2;

public class Lesson2_4 {

  int a = 101;
  int b = 20;

  public void compareNumbers() {

    if (a >= b) {
      System.out.println("a>=b");
    } else {
      System.out.println("a<=b");
    }

  }

  public static void main(String[] args) {
    Lesson2_4 print = new Lesson2_4();
    print.compareNumbers();
  }
}
