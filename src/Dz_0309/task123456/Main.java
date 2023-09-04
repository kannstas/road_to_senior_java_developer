package Dz_0309.task123456;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //1. Создать экземпляр класса Path, указав путь к файлу или директории.

        Path path = Paths.get("/Users/itprofil/Desktop/IT/JavaCore/src/Dz_0309/task2/text1.txt");

        //  2. Проверить, существует ли файл или директория по указанному пути

        System.out.println(Files.isDirectory(path));
        System.out.println(Files.exists(path));

        // 3.Получить список всех файлов в директории по указанному пути. [Ljava.io.File;@2a84aee7

        File dir = new File("Dir1");
        dir.mkdir();

        Path dirPath = Paths.get("/Users/itprofil/Desktop/IT/JavaCore/src/Dz_0309/task2/Dir1");
        System.out.println(dirPath.toFile().listFiles());

        // 4. Получить информацию о файле или директории (размер, дата создания/изменения и т.д.).

        System.out.println("file name " + path.getFileName());
        System.out.println("file parent " + path.getParent());

        System.out.println("file size " + path.toFile().length());


        Date date = new Date(path.toFile().lastModified());
        System.out.println("file last modified " + date);

        try {
            FileTime fileTime = (FileTime) Files.getAttribute(path, "creationTime"); // ??
            System.out.println(fileTime.toInstant());
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}

// 5.  Создать новую директорию по указанному пути.
// 6.  Создать новый файл по указанному пути.






