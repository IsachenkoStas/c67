package HomeTask11;

import java.util.Arrays;
import java.util.Scanner;

public class MainStringMethods {
    public static void main(String[] args) {
        // Task 2
/*        Scanner scanner = new Scanner(System.in);
        String line = "hello madam do you like Radar";
        String[] arr = line.split(" ");
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        if (n <= arr.length) {
            StringBuilder sBL = new StringBuilder(arr[n - 1]);
            sBL.reverse();
            String res = sBL.toString();
            if (res.equalsIgnoreCase(arr[n - 1])) {
                System.out.println("This is palindrome!!");
            } else {
                System.out.println("No, it's not palindrome");
            }
        }
// Task 1.1
        int numberOfStrings = 3;
        Scanner sc = new Scanner(System.in);
        String shortestLine = null;
        String longest = null;
        for (int i = 0; i < numberOfStrings; i++) {
            System.out.println("Введите строку №" + (i + 1));
            String line = sc.nextLine();
            if (i == 0) {
                shortestLine = line;
            } else if (shortestLine.length() > line.length()) {
                shortestLine = line;
            }
            if (i == 0) {
                longest = line;
            } else if (longest.length() < line.length()) {
                longest = line;
            }
        }
        System.out.println("Самая короткая строка: " + shortestLine + ". Длинна самой короткой строки: " + shortestLine.length());
        System.out.println("Самая длинная строка: " + longest + ". Длинна самой длинной строки: " + longest.length());
// Task 1.2
        Scanner scan = new Scanner(System.in);
        String[] linesArr = new String[3];
        for (int i = 0; i < linesArr.length; i++) {
            System.out.println("Введите строку №" + (i + 1));
            linesArr[i] = scan.nextLine();
        }
        Arrays.sort(linesArr);
        System.out.println(Arrays.toString(linesArr));
//Task 1.3
        int average = 0;
        Scanner sc2 = new Scanner(System.in);
        String[] linesArr = new String[3];
        for (int i = 0; i < linesArr.length; i++) {
            System.out.println("Введите строку №" + (i + 1));
            linesArr[i] = sc2.nextLine();
            average += linesArr[i].length();
        }
        average /= linesArr.length;
        for (int i = 0; i < 3; i++) {
            if (linesArr[i].length() < average) {
                System.out.println("Строка с длинной меньше чем средняя длинна: " + linesArr[i] + ". Её длинна: " + linesArr[i].length());
            }
        }*/
        //Task 1.4


        // Task 1.5
/*        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку - ");
        String line = scanner.nextLine();
        char[] ch = line.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            String symbol = String.valueOf(line.charAt(i));
            System.out.print(symbol.repeat(2));
        }*/

    }
}