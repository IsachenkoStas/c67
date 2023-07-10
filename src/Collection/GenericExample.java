package Collection;

public class GenericExample <T>{ // <Type>, можно несколько писать
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}