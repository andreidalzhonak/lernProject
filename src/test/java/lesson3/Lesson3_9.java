package lesson3;

public class Lesson3_9 {

    public static void main(String[] args) {

        twoDArray();

    }

    public static void twoDArray() {
        int N = 6;
        int table[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            table[i][i] = 1;
            table[i][table.length - i - 1] = 1;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(table[i][j] + " ");
            System.out.println();
        }
    }
}

