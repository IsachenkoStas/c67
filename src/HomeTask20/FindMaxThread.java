package HomeTask20;

import java.util.Arrays;

public class FindMaxThread extends Thread {

    private int[] array;

    public FindMaxThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
//        int max = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//        System.out.println("max value = " + max);
        System.out.println("max value = " + Arrays.stream(array).max());
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
