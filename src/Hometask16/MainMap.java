package Hometask16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MainMap {
    public static void main(String[] args) {

// Task 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the line: ");
        String line = scanner.nextLine();
        String[] array = line.split(" ");
        HashMap<String, Boolean> hashMap = new HashMap<>();
        for (String word : array){
            if (hashMap.containsKey(word)){
                hashMap.replace(word, true);
            } else {
                hashMap.put(word, false);
            }
        }
        System.out.println(hashMap);

// Task 2
//        String[] array = new String[]{"my", "name", "is", "Slim", "Shady"};
//        HashMap<String, String> hashMap = new HashMap<>();
//        for (String word : array) {
//            char[] charArray = word.toCharArray();
//            String firstSymbol = String.valueOf(charArray[0]);
//            String lastSymbol = String.valueOf(charArray[charArray.length - 1]);
//            hashMap.put(firstSymbol, lastSymbol);
//        }
//        System.out.println(hashMap);
    }
}

