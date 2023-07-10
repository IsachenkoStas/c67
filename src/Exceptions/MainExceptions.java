package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainExceptions {
    public static void main(String[] args) {
        //покдлючение к базам данных
        // Throwable, error , exception
        //try catch
        //важна иерархия исключений, когда прописываешь блоки catch

/*        int num = 0;
        try {
            System.out.println(10 / num);
        } catch (ArithmeticException e) {
            System.out.println("error 404 not found" + e.getCause());
        }


        int[] array = {1, 2, 3, 4, 5};
        try {
                System.out.println(array[5]);
        } catch (IndexOutOfBoundsException | ArithmeticException exception){
            System.out.println("wrong index");
        } finally {

        }*/

//        try {
//            FileInputStream s = new FileInputStream("D:\\file.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        //можно наследоваться от RunTimeException, и будет необязательно писать тай кетч блок

        Person p = new Person(3);
    }
}