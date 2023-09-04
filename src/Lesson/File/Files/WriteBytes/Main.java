package Lesson.File.Files.WriteBytes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("/Users/itprofil/Desktop/IT/JavaCore/src/Lesson/File/Files/WriteBytes/text.txt");
        Scanner in = new Scanner(System.in);
/*
        String text2 = "Hello приветттт";
        byte [] arr = text2.getBytes();
        System.out.println(Arrays.toString(arr));

        System.out.println('\u0410');

 */


        while (true) {
            System.out.println("Введите имя для записи или stop для остановки");
            String line = in.nextLine();

            if (line.equalsIgnoreCase("stop")) {
                break;
            }
            line = "Client "+ line + "\n";
            try {
                Files.write(path, line.getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                System.out.println("файл не найден");
            }

        }
        in.close();


    }
}
