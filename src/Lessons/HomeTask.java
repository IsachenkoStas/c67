package Lessons;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class HomeTask {
    public static void main(String[] args) {
//        Task 1
/*        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }*/
//        Task 2
/*        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min: " + min + " max: " + max);*/
//        Task 3
/*        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        int max = array[0];
        int indexMax = 0;
        int min = array[0];
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
        }
        System.out.println("indexMax = " + indexMax + " indexMin = " + indexMin);*/
//        Task 4
/*        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        int countZeroEl = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                countZeroEl++;
            }
        }
        if (countZeroEl > 0) {
            System.out.println(countZeroEl);
        } else {
            System.out.println("There is no zero elements :( ");
        }*/
//        Task 5
/*        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(array));*/
//        Task 6
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        boolean sequence = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                sequence = true;
            } else {
                sequence = false;
            }
            break;
        }
        System.out.println("Array with an increasing sequence? " + sequence);
    }
}




