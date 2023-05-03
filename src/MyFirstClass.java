import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MyFirstClass {
    public static void main(String[] args) {
/*
        int x = 5;
        int y = 15;
        System.out.println(Math.max(x, y));
        System.out.println(Math.min(x, y));
        System.out.println(Math.round(7.8)); // еще есть floor и ceil, то есть пол и потолок, смотря в какую сторону хочешь округлить
        System.out.println(Math.sqrt(x)); // квадратный корень
        System.out.println(Math.pow(3, 5)); // возведение в степень
        System.out.println(Math.random());
*/
        /*Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        scanner.nextLine();
        String line = scanner.nextLine();

        System.out.println(result);
        System.out.println(line);*/

/*
        String[] array = new String[4];
        array[2] = "wasssup";
        System.out.println(array[2]);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
*/
/*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        double[] masDouble = new double[scanner.nextInt()];
        for (int i = 0; i < masDouble.length; i++) {
            masDouble[i] = (int) (Math.random() * 10);
            System.out.print(masDouble[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < masDouble.length; i++) {
            if (i % 2 != 0) {
                masDouble[i] = Math.pow(masDouble[i], 2);
            }
            System.out.print(masDouble[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < masDouble.length; i++) {
            System.out.print(masDouble[i] + " ");
        }
        System.out.println(" ");
        for (int i = masDouble.length - 1; i >= 0; i--) {
            System.out.print(masDouble[i] + " ");
        }*/

//        forEach - не умеет сохранять изменения
        int array[] = {1, 5, 7, 8, 3};
        int arr[] = {0, 0, 0, 0, 0, 0, 0};
/*        for (int number : array) {
            System.out.print(number);
        }
        System.out.println(Arrays.toString(array));
        // сортировка массива
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        // найти элементы
        System.out.println(Arrays.binarySearch(array, 8));*/
        System.arraycopy(array, 1, arr, 1, 2);
        System.out.println(Arrays.toString(arr));
    }
}
