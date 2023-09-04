package Dz_0309.task1Old;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/*
1 принять со сканера название файла и создать файл с этим названием по уже готовому пути
2. Получить размер файла в байтах и мегабайтах.
3. Удалить директорию
4. создать 5 файлов и добавит их в масив после посчитать их общий размер
метод size получить размер

либо создать файлы в 1 диреткории и получить лсит  файов этой диреткории

Метод path2.toFile().listFiles() используется в Java для получения списка файлов в заданном каталоге, указанном объектом Path.

path2.toFile() конвертирует объект Path в объект File, который представляет файловую систему. Затем метод listFiles() вызывается для объекта File, чтобы получить список файлов в заданном каталоге.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Введите название файла");
        Scanner in = new Scanner(System.in);
        String fileName = in.nextLine();

        // создание файла? как его засунуть в папку??

        File file = new File (fileName);

        try {
            if (file.createNewFile()) {

                System.out.println("file created " + fileName);

        }

        } catch (IOException e) {
            System.out.println("file not created");
        }

        Path path = Paths.get("/Users/itprofil/Desktop/IT/JavaCore/src/Dz_0309/task1Old/testTask1Old.txt");

        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
