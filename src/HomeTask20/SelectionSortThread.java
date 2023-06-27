package HomeTask20;

import java.util.Arrays;

public class SelectionSortThread extends Thread {
    private int[] sortArr;

    public SelectionSortThread(int[] array) {
        this.sortArr = array;
    }

    @Override
    public void run() {
        for (int i = 0; i < sortArr.length; i++) {
            int pos = i;
            int min = sortArr[i];
            for (int j = i + 1; j < sortArr.length; j++) {
                if (sortArr[j] < min) {
                    pos = j;
                    min = sortArr[j];
                }
            }
            sortArr[pos] = sortArr[i];
            sortArr[i] = min;
        }
        System.out.println("Сортировка выбором - " + Arrays.toString(sortArr));
    }

    public int[] getSortArr() {
        return sortArr;
    }

    public void setSortArr(int[] sortArr) {
        this.sortArr = sortArr;
    }
}
