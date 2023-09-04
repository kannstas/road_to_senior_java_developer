package Lesson.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ScannerFile {
    public static void main(String[] args) {
        Path path = Paths.get("/Users/itprofil/Desktop/IT/JavaCore/src/Lesson/File/text.txt");
        try (Scanner in = new Scanner(path.toFile())) {
            while(in.hasNextLine()){
                String line = in.nextLine();
                if(line.contains("Russia")){
                    System.out.println(line);
                }
            }

        }catch (FileNotFoundException e){
            System.out.println("not file");
        }

    }
}
