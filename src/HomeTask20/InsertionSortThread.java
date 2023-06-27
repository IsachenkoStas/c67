package HomeTask20;

import java.util.Arrays;

public class InsertionSortThread extends Thread{
    private int[] array;

    public InsertionSortThread(int[] array){
        this.array = array;
    }

    @Override
    public void run() {
        int j;
        for (int i = 1; i < array.length; i++) {
            int swap = array[i];
            for (j = i; j > 0 && swap < array[j - 1]; j--) {
                array[j] = array[j - 1];
            }
            array[j] = swap;
        }
        System.out.println("Сортировка вставками - " + Arrays.toString(array));
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
