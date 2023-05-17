package Lessons;

import java.util.Arrays;
import java.util.Random;

public class MyClass {
    public static void main(String[] args) {
        // МНОГОМЕРНЫЕ МАССИВЫ
        /*        int[][] binArray = {{9, 3, 100, 16}, {7, 3, 1}}; // строки и столбики, для обращения сначала строка потом столбец
         *//*        System.out.println(Arrays.deepToString(binArray));
        System.out.println(binArray[2].length);

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 4};
        System.out.println(Arrays.equals(a, b)); // deepEquals для многомерных массивов*//*

        // перебрать элементы
        for (int i = 0; i < binArray.length; i++) {
            for (int j = 0; j < binArray[i].length; j++) {
                System.out.print(binArray[i][j] + " ");
            }
            System.out.println();
        }
        Random random = new Random();
        random.nextInt();
    }*/
/*        Random random = new Random();
        random.nextInt();
        int[][] binArray = new int[5][5];
        int max = binArray[0][0];
        for (int i = 0; i < binArray.length; i++) {
            for (int j = 0; j < binArray[i].length; j++) {
                binArray[i][j] = random.nextInt(30); // до 30 рандом
                System.out.print(binArray[i][j] + " ");
                if (binArray[i][j] > max) {
                    max = binArray[i][j];
                }
            }
            System.out.println();
        }
        System.out.println(max);*/
        int[] arr = {5, 7, 20, 55};
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr, 17);
        System.out.println(Arrays.toString(arr));
    }
}

