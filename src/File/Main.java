package File;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) throws IOException {
//        File file = new File("/Users/allencooper/Desktop/Java/Java.txt");
//
//        boolean res = file.createNewFile();
//        boolean createFolder = file.mkdir();
//        if (file.isFile()) {
//            System.out.println("Its file");
//        } else if (file.isDirectory()){
//            System.out.println("some folder");
//        }
//
//        File allFiles[] = file.listFiles();
//        System.out.println(Arrays.toString(allFiles));
//
//        String text = "Hello my name is slim shady, как дела красавица";
//        FileOutputStream outputStream = new FileOutputStream(file);
//        outputStream.write(text.getBytes());
//        outputStream.close();
//        outputStream.flush(); //  говорит сохранить информацию, которая была внесена до него

//        int i;
//        FileInputStream fileInputStream = new FileInputStream(file);
//        while ((i = fileInputStream.read()) != -1){
//            System.out.print((char) i);
//        }
//        fileInputStream.close();

//        FileReader fr = new FileReader(file);
//        int i;
//        while ((i = fr.read()) != -1){
//            System.out.print((char) i);
//        }
//        fr.close();
//    ЕСЛИ ДОПИСАТЬ TRUE (в то место где пишем file), он не будет заменять, а будет добавлять к имеющемуся
//        try (FileWriter fw = new FileWriter(file)){
//            fw.write("Hello world");
//            fw.write("We are the best group");
//            fr.flush();
//        } catch (IOException e){
//            e.printStackTrace();
//        }

        Path path = Paths.get("AccsInfo.txt");
        System.out.println(path.endsWith(".txt"));
    }
}