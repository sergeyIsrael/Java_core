package Lesson_5_Input_Output_Stream;

import java.io.*;

public class TrainingInputOutputApp {


    public static void main(String[] args) throws IOException {

        // Create a new file
        File fileCSV = new File("src/resources/data_5.csv");

        String headerOrig = "Value1"+ ";" + "Value2" + ";" + "Value3" + ";" + "\n";
        int[][] dataOrig = { {1, 200, 300},
                             {2, 222, 333} };

//        1) записываем headerOrig и dataOrig
//        через FileWriter в data_5.csv
//        dataOrig преобразовываем в строку
        try (FileWriter writer = new FileWriter(fileCSV, true)) {
            writer.write(headerOrig);
            for (int i = 0; i < dataOrig.length; i++) {
                for (int j = 0; j < dataOrig.length; j++) {
                    writer.write(String.valueOf(dataOrig[i][j] + ";"));
                }
            }
        }

//        2) Записываем dataOrig в data_5.csv
//
//        записать в файл

//        прочитать байты
//        конвертировать байты обратно
//        сохранить куда надо



    }
}
