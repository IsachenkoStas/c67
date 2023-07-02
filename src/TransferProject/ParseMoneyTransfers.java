package TransferProject;

import java.io.File;
import java.util.List;

public class ParseMoneyTransfers {

    public static void getFiles(File rootFile, List<File> fileArchive) {
        if (rootFile.isDirectory()) {
            File[] directoryFiles = rootFile.listFiles();
            if (directoryFiles != null) {
                for (File file: directoryFiles) {
                    if (file.isDirectory()) {
                        getFiles(file, fileArchive);
                    } else {
                        if (file.getName().toLowerCase().endsWith(".txt")) {
                            fileArchive.add(file);
                        }
                    }
                }
            }
        }
    }
}
