package Dz_0309.task7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        writeInText();


    }

    public static void writeInText() {
        Path path = Paths.get("/Users/itprofil/Desktop/IT/JavaCore/src/Dz_0309/task7/writeString.txt");

       while (true) {
           System.out.println("Введите кличку и возраст питомца или end для выхода из системы");


              Scanner in = new Scanner(System.in);
              String answer = in.nextLine();

              if (answer.equalsIgnoreCase("end")) {
                  break;

              } try {
               Files.writeString(path, "Хвостатый пациент " + answer + "\n", StandardOpenOption.APPEND);
           } catch (IOException e) {
               e.printStackTrace();
           }



       }





    }
}
