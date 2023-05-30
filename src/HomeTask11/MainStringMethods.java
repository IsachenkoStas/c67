package HomeTask11;

import java.util.Arrays;
import java.util.Scanner;

public class MainStringMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = "hello madam do you like Radar";
        String[] arr = line.split(" ");
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
    }
}