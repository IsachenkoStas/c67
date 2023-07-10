package HomeTask20;

import java.util.Arrays;
import java.util.stream.Stream;

public class FindMinThread extends Thread {

    private int[] array;

    public FindMinThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        System.out.println("min value = " + Arrays.stream(array).min());
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
