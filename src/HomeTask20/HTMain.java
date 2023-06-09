package HomeTask20;

import java.util.Scanner;

public class HTMain {
    public static void main(String[] args) {
        System.out.print("Enter array size - ");
        int size = new Scanner(System.in).nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the value - ");
            array[i] = new Scanner(System.in).nextInt();
        }

        FindMaxThread thread1 = new FindMaxThread(array);
        FindMinThread thread2 = new FindMinThread(array);

        thread1.start();
        thread2.start();

        SelectionSortThread selectionSortThread = new SelectionSortThread(array);
        InsertionSortThread insertionSortThread = new InsertionSortThread(array);
        BubbleSortThread bubbleSortThread = new BubbleSortThread(array);

        selectionSortThread.start();
        insertionSortThread.start();
        bubbleSortThread.start();
    }
}
