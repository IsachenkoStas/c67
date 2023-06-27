package HomeTask20;

import java.util.Arrays;

public class BubbleSortThread extends Thread{
    private int[] sortArr;

    public BubbleSortThread(int[] array){
        this.sortArr = array;
    }

    @Override
    public void run() {
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
        System.out.println("Сортировка пузырьком - " + Arrays.toString(sortArr));
    }

    public int[] getSortArr() {
        return sortArr;
    }

    public void setSortArr(int[] sortArr) {
        this.sortArr = sortArr;
    }
}
