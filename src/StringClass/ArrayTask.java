package StringClass;

import java.util.Arrays;

public class ArrayTask {
    public static void main(String[] args) {
        int[] array = {0, 1, 4, 3};
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (i != array[i]) {
                System.out.println("missed num - " + i);
            }
        }
    }
}
