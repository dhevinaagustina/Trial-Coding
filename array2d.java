import java.util.Scanner;

public class array2d {

    public static void main(String[] args) {
        // Deklarasi array 2 dimensi
        int[][] array2d = new int[5][3];

        // Mengisi data ke array 2 dimensi
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print("Masukkan nilai array [" + i + "][" + j + "]: ");
                array2d[i][j] = input.nextInt();
            }
        }

        // Menampilkan data dari array 2 dimensi
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}

    







