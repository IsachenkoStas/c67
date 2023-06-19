package Hometask16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MainMap {
    public static void main(String[] args) {

// Task 1
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the line: ");
//        String line = scanner.nextLine();
//        String[] array = line.split(" ");
//        Arrays.sort(array);
//        HashMap<String, Boolean> hashMap = new HashMap<>();
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i].equals(array[j])) {
//                    hashMap.put(array[j], true);
//                } else {
//                    hashMap.put(array[j], false);
//                }
//            }
//        }
//        System.out.println(hashMap);

// Task 2
        String[] array = new String[]{"my", "name", "is", "Slim", "Shady"};
        HashMap<String, String> hashMap = new HashMap<>();
        for (String word : array) {
            char[] charArray = word.toCharArray();
            String firstSymbol = String.valueOf(charArray[0]);
            String lastSymbol = String.valueOf(charArray[charArray.length - 1]);
            hashMap.put(firstSymbol, lastSymbol);
        }
        System.out.println(hashMap);
    }
}

