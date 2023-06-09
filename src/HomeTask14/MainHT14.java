package HomeTask14;

import java.io.*;
import java.util.Arrays;
import java.util.Collection;

public class MainHT14 {
    public static void main(String[] args) throws IOException {
/*        FileReader fileReader = new FileReader("/Users/allencooper/Desktop/romeo-and-juliet.txt");
        int i;
        StringBuilder txt = new StringBuilder();
        while ((i = fileReader.read()) != -1) {
            txt.append((char) i);
        }
        fileReader.close();
        String[] arr = txt.toString().split("\\W");
        String max = arr[0];
        for (String s : arr) {
            if (s.length() > max.length()) {
                max = s;
            }
        }
        System.out.print("Самое длинное слово - " + max);
        System.out.print(". Его длинна = " + max.length());

        FileWriter fw = new FileWriter("/Users/allencooper/Desktop/max.txt");
        fw.write(max);
        fw.close();*/


        FileReader fr = new FileReader("/Users/allencooper/Desktop/docnums.txt");
        int i;
        StringBuilder docNumsTxt = new StringBuilder();
        while ((i = fr.read()) != -1) {
            docNumsTxt.append((char) i);
        }
        fr.close();
        FileWriter fileWriter = new FileWriter("/Users/allencooper/Desktop/validDocNums.txt", true);
        FileWriter fileWriter1 = new FileWriter("/Users/allencooper/Desktop/notValidDocNums.txt", true);
        String[] array = docNumsTxt.toString().split("\\s");
        for (String s : array) {
            if (s.matches("docnum\\w{9}") || s.matches("contract\\w{7}")) {
                fileWriter.write(s + "\n");

            } else {
                fileWriter1.write(s + " - не подходит по условиям валидности\n");
            }
        }
        fileWriter.close();
        fileWriter1.close();
    }
}