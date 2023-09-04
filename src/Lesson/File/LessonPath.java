package Lesson.File;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LessonPath {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/itprofil/Desktop/IT/JavaCore/src/Lesson/File/d1");
        Path path1 = Paths.get("/Users/itprofil/Desktop/IT/JavaCore/src/Lesson/File/d1/text2.txt");

        System.out.println(path.getFileName());
        System.out.println(path1.getFileName());

        System.out.println(path1.getParent());

        System.out.println(path1.getRoot());

        System.out.println(path1.getNameCount()); // сколько папко проходит

        System.out.println(path1.toAbsolutePath()); // выводит ссылку, как добраться до файла

        System.out.println(Files.exists(path1));
        System.out.println(Files.isDirectory(path1));

        if (Files.isDirectory(path1)) {
            Files.delete(path1);
        }else {
            Files.deleteIfExists(path1);
        }


        // создание пути с файлом
        Path path2 = Paths.get("/Users/itprofil/Desktop/IT/JavaCore/src/Lesson/File/d1/text2.txt");
        while (Files.notExists(path2)) {
            if (Files.exists(path2)) {
                if (Files.notExists(path2.getParent())) {
                    Files.createDirectories(path2.getParent());
                    // все файлы в директории
                    path2.toFile().listFiles();
                    Files.list(path2);
                }
            } else {
                System.out.println("create file");
                Files.createFile(path2);
            }
        }
    }
}
