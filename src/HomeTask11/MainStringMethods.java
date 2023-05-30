package HomeTask11;

import java.util.Arrays;
import java.util.Scanner;

public class MainStringMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String[] arr = {"hello", "madam", "do", "you", "like", "radar"};
        String line = "hello madam do you like radar";
        String[] arr = line.split(" ");
        int n = scanner.nextInt();
        for (int i = 0; true; ) {
            if (n <= arr.length) {
                i = n - 1;
                StringBuilder sBL = new StringBuilder(arr[i]);
                sBL.reverse();
                String res = sBL.toString();
                if (res.equalsIgnoreCase(arr[i])) {
                    System.out.println("This is palindrome!!");
                } else {
                    System.out.println("No, it's not palindrome");
                }
            }
            break;
        }
    }
}
