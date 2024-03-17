package lesson3;

import java.util.Scanner;

public class Lesson3_5 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите год:\n a =");
    int a = scanner.nextInt();
    if (a % 4 == 0) {
      if ((a % 100 != 0) || (a % 400 == 0)) {
        System.out.println(true);
      }
    } else {
      System.out.println(false);
    }
  }
}