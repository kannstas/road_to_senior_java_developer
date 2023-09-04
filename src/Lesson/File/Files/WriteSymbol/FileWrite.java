package Lesson.File.Files.WriteSymbol;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) {
        Path path = Paths.get("/Users/itprofil/Desktop/IT/JavaCore/src/Lesson/File/Files/text.txt");

        Scanner in = new Scanner(System.in);


        while (true) {
            System.out.println("Введите имя для записи или stop для остановки");
            String line = in.nextLine();
            if (line.equalsIgnoreCase("stop")) {
                break;
            }

            try {
                Files.writeString(path, "Клиент " + line + "\n", StandardOpenOption.APPEND);
            } catch (IOException e) {
                System.out.println("файл не найден");
            }

        }
        in.close();

    }
}

