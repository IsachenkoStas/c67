package StringClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainRegex {
    public static void main(String[] args) {
//        String testLine = " hello me name is slim Shady! 5345";
//        String pattern1 = "[A-z]"; // 1 - что ищем, 2 - сколько ищем // если {2,} значит от двух и больше рад
//        String patternNew = "\\d{2}";
//        System.out.println(testLine.replaceAll(pattern1, "&"));

        // ? - один или отсутствует (после квадратных скобок)
        // * - сколько угодно раз может встречаться
        // + - один и больше раз => {1,}
        // [a-z&&[^cb]] от а до з, кроме б и с
        // \\d - ищет цифры, \\D - все кроме цифр
        // \\s - пробелы

        String line = "Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills";

        //  Pattern pattern = Pattern.compile("@[A-z]+");
        //       Pattern pattern = Pattern.compile("^null$");
        String test = "Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills!";
        Pattern pattern = Pattern.compile("[А-Я][а-я]+ [А-Я][а-я]+");
        Matcher matcher = pattern.matcher(test);
//        System.out.println(matcher.replaceAll(""));
        while (matcher.find()) {
//            System.out.println(matcher.start());
//            System.out.println(matcher.end());
            System.out.println(matcher.group());
        }
    }
}

