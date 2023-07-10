package HomeTask20;

import java.util.Arrays;

public class FindMaxThread extends Thread {

    private int[] array;

    public FindMaxThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        System.out.println("max value = " + Arrays.stream(array).max());
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
