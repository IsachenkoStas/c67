package File;

import java.io.*;
import java.util.Scanner;

public class MainTask {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("/Users/allencooper/Desktop/Java/tms.txt");
        boolean res = file.createNewFile();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String line = scanner.nextLine();
        FileWriter fw1 = new FileWriter(file);
        fw1.write(line);
        fw1.close();

        int i;
        StringBuilder test = new StringBuilder();
        FileReader fr1 = new FileReader(file);
        while ((i = fr1.read()) != -1) {
            test.append((char) i);
        }
        fr1.close();
//        System.out.println(test.toString().replace(" ", "_"));
        System.out.println(test.toString().charAt(0));

        Weekend weekend = new Weekend();
        weekend.name = "Friday";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/Users/allencooper/Desktop/Java/weekend.txt"));

        objectOutputStream.writeObject(weekend);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/Users/allencooper/Desktop/Java/weekend.txt"));
        Weekend weekendNew = (Weekend) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(weekendNew.name);

//        transient String surname; // не сериализирует, то есть не сохраняет, если пометить словом !трансиент!
    }
}
