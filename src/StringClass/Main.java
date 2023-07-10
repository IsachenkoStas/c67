package StringClass;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String line = "Group 671";

//        System.out.println("Group 67".length()); // количество символов
//        System.out.println(line.trim()); // убирает лишние пробелы
//        System.out.println(line.charAt(3)); //символ по индексу
//        System.out.println(line.indexOf("p")); // первое вхождение
//        System.out.println(line.concat(" - we are javisty")); // складывание строк (конкатенация)
//        System.out.println(line.substring(3)); //с 3 индекса и до конца
//        System.out.println(line.substring(2, 5)); // со 2 по 5 индекс
//        System.out.println(line.equals("Group 68")); equalsIgnoreCase - не смотри на регистр букв
//        System.out.println(line.compareTo("Group 68")); // сравнение строк, возвращает интовое значение
//        System.out.println(line.toUpperCase()); // делает все буквы большими
//        System.out.println(line.toLowerCase()); // делает все маленькими
//        System.out.println(line.replace("6", "1000 - "));
//        System.out.println(line.replaceAll("[0-9]{3}", "7"));
//        System.out.println(Arrays.toString(line.getBytes())); //преобразовать в байт[]
//        System.out.println(Arrays.toString(line.toCharArray())); // массив символов
//        System.out.println(Arrays.toString(line.split(" ")));//разделяем на подстроки по делителю
//        System.out.println(line.startsWith("Group")); // начинается ли строка с этого
//        System.out.println(line.endsWith("1")); // заканчивается ли
//        System.out.println(line.contains("ou")); // проверка, содержит ли строка
//        System.out.println(" ".isBlank());// проверяте пустая ли строка, но игнорирует пробелы
//        System.out.println("".isEmpty()); // проверяет пустая ли строка(на кол-во символов)
//        System.out.println(line.repeat(3)); // повторяет строку n раз
//        System.out.println(line.stripLeading()); убирает пробелы в начале строки
//        System.out.println(line.stripTrailing()); убирает пробелы в конце строки (справа)
//        System.out.println(line.stripIndent());
//        System.out.println(line.intern());// перекладвает объект из кучи в пул строк
//        System.out.println("hello" + "world");
//        String simpleLine = new String("Hello");
//        String stringPoolLine = "Hello";
//        stringPoolLine = stringPoolLine.intern();
//        String block = """
//               Hello world
//               how r u?
//               ok
//               """;
//        System.out.println(block);
//        System.out.println(String.valueOf("true " + 555));

/*
        String firstLine = "Class";
        String secondLine = "Task";
        firstLine.concat("11");
        firstLine.equalsIgnoreCase(secondLine);
        firstLine.substring(3);
        secondLine.length();
        secondLine.indexOf("a");
        String.valueOf(true);
        firstLine.toUpperCase();
        firstLine.replace("s", "p");
        firstLine.trim();
        firstLine.isEmpty();
        secondLine.split(" ");
*/

    /*    StringBuilder stringBuilderLine = new StringBuilder("         I       am        the           String           Builder            ");
        System.out.println(stringBuilderLine);*/

//        stringBuilderLine.append("this is end of line!"); //добавить в конец строки
//        stringBuilderLine.delete(4,7);// удалить с какой то по какой то символ
//        stringBuilderLine.deleteCharAt(4); // удалить один символ по индексу
//        stringBuilderLine.insert(3, "bye"); // заменить по индексу
//        stringBuilderLine.reverse();
//        String lineFromSB = stringBuilderLine.toString();
//        StringBuffer используется в многопоточной среде
        // нет смысла сравнивать билдер и просто стринг -  разные классы
//        stringBuilderLine.append("xxxx");
//        stringBuilderLine.insert(5, "y"); добавляет
//        stringBuilderLine.delete(3, 6);
//        stringBuilderLine.reverse();
//        System.out.println(Arrays.toString(line.split(" ")));
    }
}
