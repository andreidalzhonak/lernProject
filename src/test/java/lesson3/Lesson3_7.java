package lesson3;

public class Lesson3_7 {

    public static void main(String[] args) {

        emptyArray();

    }

    public static void emptyArray() {
        int[] arr = new int[101];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println();
    }
}

