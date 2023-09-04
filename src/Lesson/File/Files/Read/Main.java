package Lesson.File.Files.Read;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {


    public static void main(String[] args) {
       // readLines();
        readJava("Java");

    }

    public static void readString () {
        Path path = Paths.get("/Users/itprofil/Desktop/IT/JavaCore/src/Lesson/File/Files/Read/text.txt");
        try {
            String s = Files.readString(path);
            System.out.println(s);
        } catch (IOException e) {
            System.out.println("file not found");
        }

    }

    public  static void readLines () {
        Path path = Paths.get("/Users/itprofil/Desktop/IT/JavaCore/src/Lesson/File/Files/Read/text.txt");
        try {
            int n = 1;
            List<String> list = Files.readAllLines(path);
            for (String s : list) {
                if (s.isBlank()) {
                    System.out.println(s);
                } else {
                    System.out.println(n++ + ") " + s);
                }

            }
        } catch (IOException e) {
            System.out.println("file not found");
        }

    }

    public static void readJava (String word) {
        Path path = Paths.get("/Users/itprofil/Desktop/IT/JavaCore/src/Lesson/File/Files/Read/text.txt");
        try {
            int n = 1;
            String [] arr = Files.readString(path).split("\\.");
            for (String s : arr) {
                n++;
                if (s.contains(word)) {
                    System.out.println(n +") " + s.trim()+".\n");
                }
            }
        } catch (IOException e) {
            System.out.println("file not found");
        }
    }
}
