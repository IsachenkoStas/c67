package HomeTask15;

import java.util.Arrays;
import java.util.Objects;

public class MyOwnList<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;

    public MyOwnList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity <= 0");
        } else {
            list = (T[]) new Object[capacity];
        }
    }

    public MyOwnList() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void add(T element) {
        list[size++] = element;
    }

    public void remove(int index) {
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException("Wrong index");
        } else {
            if (size - index >= 0) System.arraycopy(list, index + 1, list, index, size - index);
//            for (int i = index; i < size; i++) {
//                list[i] = list[i + 1];
//            }
        }
    }

    public T getElem(int index) {
//        if (index < 0 || index > size - 1) {
//            throw new IllegalArgumentException("Wrong index");
//        } else {
//            return list[index];
//        }
        Objects.checkIndex(index, size);
        return list[index];
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(list[i])) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            list[i] = null;
        }
    }

    @Override
    public String toString() {
        return "MyOwnList{" +
                "list=" + Arrays.toString(list) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyOwnList<?> myOwnList = (MyOwnList<?>) o;
        return size == myOwnList.size && Arrays.equals(list, myOwnList.list);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size, DEFAULT_CAPACITY);
        result = 31 * result + Arrays.hashCode(list);
        return result;
    }
}
