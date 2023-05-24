package Interface;

public interface FirstInterface {

    public final static int WHEELS = 4;

    void start();

    void stop();

    default void signal(){
        System.out.println("make sound");
        privateMethod();
    }

    static void changeSpeed(int newSpeed){
        System.out.println("this is static method");
    }
    //можем использовать в дефолт блоке(теле метода)
    private void privateMethod(){
        System.out.println("private method");
    }
    // абстрактные методы - методы без реализации (в интрефейсе)
    // все методы публичные (public)
    // НЕЛЬЗЯ СОЗДАВАТЬ ОБЪЕКТЫ
    // интерфейсы могут наследоваться друг от друга
    // есть множественное наследование интерфейсов
    // функциональный интерфейс содержит ОДИН абстрактный метод


}
