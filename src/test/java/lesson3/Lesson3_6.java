package lesson3;

public class Lesson3_6 {

  public static void main(String[] args) {

    invertArray();

  }

  public static void invertArray() {
    int[] arr = {1, 0, 1, 0, 1, 1};
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 1) {
        arr[i] = 0;
      } else if (arr[i] == 0) {
        arr[i] = 1;
      }
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}

