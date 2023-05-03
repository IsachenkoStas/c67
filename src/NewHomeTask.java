import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NewHomeTask {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(100);
                array[i][j] = array[i][j] + number;
                sum += array[i][j];
            }
        }
        System.out.println(Arrays.deepToString(array) + " ");
        System.out.println("Сумма всех элементов нового массива = " + sum);

/*        String[][] array = new String[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("W ");
                } else {
                    System.out.print("B ");
                }
            }
            System.out.println();
        }*/
    }
}
