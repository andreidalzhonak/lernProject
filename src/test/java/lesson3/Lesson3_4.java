package lesson3;

import java.util.Scanner;

public class Lesson3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество повторений и нажмите Enter:\n a =");
        int a = scanner.nextInt();
        System.out.print("Введите слово для повторения и нажмите Enter:\n ");
        String b = scanner.next();
        System.out.println("Выводим слова:");
        for (int u = 0; u < a; u++) {
            System.out.println(b);
        }
    }
}