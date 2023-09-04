package Dz_2208;

import java.io.File;
import java.nio.file.FileSystem;
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

Метод path2.toFile().listFiles() используется в Java для получения списка файлов в заданном каталоге,
указанном объектом Path.

path2.toFile() конвертирует объект Path в объект File, который представляет файловую систему.
Затем метод listFiles() вызывается для объекта File, чтобы получить список файлов в заданном каталоге.
 */
public class Main {
    public static void main(String[] args) {

        Path dir = Paths.get("/Users/itprofil/Desktop/IT/JavaCore/src/Dz_2208/d1");
        Scanner in = new Scanner(System.in);
            System.out.println("Введите имя файла");
            String fileName = in.nextLine();
            File file = new File(fileName);

        }
    }


