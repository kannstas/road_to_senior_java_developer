package Dz_0309.task8;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// Прочитать данные из файла.Вывести их на консоль при записи и чтение использовать не запись байтов а запись строк
public class Main {
    public static void main(String[] args) {

        Path path = Paths.get("/Users/itprofil/Desktop/IT/JavaCore/src/Dz_0309/task7/writeString.txt");

        try {
            System.out.println(Files.readString(path));
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
