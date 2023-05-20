package dz6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class File {
    public static void toFileExtraction(ArrayList<Notebook> base) {
        String data = "Ноутбуки нашего магазина\n"+"--------------------------------"+"\n\n";

        for (Notebook note : base) {
            data += note;
            data += "\n";
        }

        try {
            FileWriter fileWriter = new FileWriter("notebooks.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(data);

            bufferedWriter.close();
            fileWriter.close();

            System.out.println("Данные успешно записаны в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
