package HomeTask12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Task 1
/*        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String line = scanner.nextLine();
        Pattern pattern = Pattern.compile("[А-ЯA-Z]{2,6}");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }*/
        // Task 2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String line = scanner.nextLine();
        Pattern pattern1 = Pattern.compile("[A-z0-9._%+-]+@[A-z0-9.-]+\\.[A-z]{2,6}");
        Matcher matcher1 = pattern1.matcher(line);
        while (matcher1.find()) {
            System.out.println("email: " + matcher1.group());
        }
        Pattern pattern2 = Pattern.compile("[+][(][0-9]{2}[)][0-9]{7}");
        Matcher matcher2 = pattern2.matcher(line);
        while (matcher2.find()) {
            System.out.println("phone number: " + matcher2.group());
        }
        Pattern pattern3 = Pattern.compile("(\\d{4}-){2}\\d{2}");
        Matcher matcher3 = pattern3.matcher(line);
        while (matcher3.find()) {
            System.out.println("document number: " + matcher3.group());
        }
    }
}