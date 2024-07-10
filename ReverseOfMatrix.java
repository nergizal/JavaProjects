import java.util.Scanner;

public class ReverseOfMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a length: ");
        int length = input.nextInt();

        int[][] array = new int[length][length];
        int numbers = 1;
        int i, j, tour;

        for (tour = 0; tour <= length / 2; tour++) {
            for (i = tour, j = tour; j < length - tour; j++) {
                array[i][j] = numbers++;
            }
            j--;
            i++;
            for (; i < length - tour; i++) {
                array[i][j] = numbers++;
            }
            i--;
            j--;
            for (; j >= tour; j--) {
                array[i][j] = numbers++;
            }
            i--;
            j++;
            for (; i > tour; i--) {
                array[i][j] = numbers++;
            }
        }

        for (i = 0; i < length; i++) { //Spiralden farklı olan kısım
            for (j = 0; j < length; j++) {
                array[i][j] = (length * length) - array[i][j] + 1;
            }
        }

        for (i = 0; i < length; i++) {
            for (j = 0; j < length; j++) {
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println();
        }
  }

}
