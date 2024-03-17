package lesson3;

import java.util.Scanner;

public class Lesson3_2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число  и нажмите Enter:\n a =");
    if (scanner.hasNextInt()) {
      int a = scanner.nextInt();
      if (a >= 0) {
        System.out.println("Вы ввели положительное число:" + a);
      } else {
        System.out.println("Вы ввели отрицательное число:" + a);
      }
    } else {
      System.out.println(
          "Извините, но это явно не целое число. Перезапустите программу и попробуйте снова!");
    }
    scanner.close();
  }
}