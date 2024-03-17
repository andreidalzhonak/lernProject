package lesson3;

import java.util.Scanner;

public class Lesson3_1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число  и нажмите Enter:\n a =");
    if (scanner.hasNextInt()) {
      int a = scanner.nextInt();
      System.out.println("Спасибо! Вы ввели число " + a);
      System.out.print("Введите число и нажмите Enter:\n b =");
      if (scanner.hasNextInt()) {
        int b = scanner.nextInt();
        System.out.println("Спасибо! Вы ввели число " + b);
        int c = a + b;
        System.out.println("Сумма:" + c);
          if (c >= 10 && c <= 20) {
              System.out.println("true");
          } else {
              System.out.println("false");
          }
      }
    } else {
      System.out.println(
          "Извините, но это явно не целое число. Перезапустите программу и попробуйте снова!");
    }
    scanner.close();
  }
}