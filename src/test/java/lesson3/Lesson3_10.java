package lesson3;

public class Lesson3_10 {

  public static void main(String[] args) {

    lenArray(4, 5);

  }

  public static void lenArray(int len, int initialValue) {
    int[] arr = new int[len];
    for (int i = 0; i < len; i++) {
      arr[i] = initialValue;
      System.out.print("[" + i + "]" + arr[i] + " ");
    }
  }
}