package TransferProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> accounts = new HashMap<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("/Users/allencooper/Desktop/AccsInfo.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                accounts.put(s.substring(0, 11), Integer.parseInt(s.substring(13, 17)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<File> fileList = new ArrayList<>();
        ParseMoneyTransfers.getFiles(new File("/Users/allencooper/Desktop/differentFiles"), fileList);
        try {
            for (File file : fileList) {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                while ((line = br.readLine()) != null) {
                    if (line.matches("\\d{5}\\-\\d{5}\\|\\d{5}\\-\\d{5}\\: \\d+")) {
                        int cashOut = accounts.get(line.substring(0, 11)) - Integer.parseInt(line.substring(25));
                        int cashIn = accounts.get(line.substring(12, 23)) + Integer.parseInt(line.substring(25));
                        if (accounts.get(line.substring(0, 11)) > Integer.parseInt(line.substring(25))) {
                            accounts.replace(line.substring(0, 11), cashOut);
                            accounts.replace(line.substring(12, 23), cashIn);
                        }
                    }
                }
                try (FileWriter fileWriter = new FileWriter("/Users/allencooper/Desktop/archive.txt")) {
                    fileWriter.write(String.valueOf(fileList));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(accounts);
    }
}
