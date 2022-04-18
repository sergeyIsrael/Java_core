package Lesson_5_Input_Output_Stream;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CreateFileClass {


// мой путь к файлу
    public static final String pathToFile = "/Users/Mac/IdeaProjects/Java core/Java_core/src/resources/demo.csv";


// ❓ - не понимаю что ложить в MAIN, а что нет
//    -

    public static void main(String[] args) throws Exception {

        /* НАШ КОД
        AppData myCreatedData = createAppData();
        myWriter(createAppData());
        */


//        нужно записать ЭТО в cvs (с ";")


        Random random = new Random();
        int length = random.nextInt(10);
        String[] header = new String[length];
        for (int i = 0; i < length; i++) {
            header[i] = "H" + (i + 1);
        }

        int lengthRow = random.nextInt(10);
        Integer[][] data = new Integer[length][lengthRow];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <lengthRow; j++) {
                data[i][j] = random.nextInt(100);
            }
        }




//       1. Пишем в cvs файл
        write(data, header);

        AppData appData1 = readToAppData();

        printAppData(appData1);


    } // main close

    private static void printAppData(AppData appData1) {
        for (int i = 0; i < appData1.getHeader().length; i++) {
            System.out.print(appData1.getHeader()[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < appData1.getData().length; i++) {
            for (int j = 0; j < appData1.getData()[i].length; j++) {
                System.out.print(appData1.getData()[i][j] + " "); // убрать пробелы последние
            }
            System.out.println();
        }
    }

    private static void write(Integer[][] data, String[] header) throws IOException {

        //        ставим в header (;) semicolon
        String headerStrSemicolon = "";
        for (int i = 0; i < header.length; i++) {
            headerStrSemicolon += header[i] + ";";
        }

        try (FileWriter fileWriter = new FileWriter(pathToFile)) {
            fileWriter.write(headerStrSemicolon + "\n");     // пишем header
            for (int i = 0; i < data.length; i++) {   // пишем data
                for (int j = 0; j < data[i].length; j++) {
                    fileWriter.write(data[i][j] + ";");
                }
                fileWriter.write(System.getProperty("line.separator"));
            }
        }
    }


    //      2. Читаем с cvs файла в App Data
    public static AppData readToAppData() throws IOException {
        AppData appData = new AppData();
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            String line = br.readLine();

            appData.setHeader(line.split(";")); // Здесь считали 1 линию, это Header.
            while ((line = br.readLine()) != null) { //  ❓ мы уже определили в стр 75 что line = br.readLine()
                String[] values = line.split(";");
                records.add(Arrays.asList(values));
            }
        }

        int[][] resultData = new int[records.size()][2];

        for (int i = 0; i < records.size(); i++) {
            for (int j = 0; j < records.get(i).size(); j++) {
                resultData[i][j] = Integer.valueOf(records.get(i).get(j));
            }
        }
        appData.setData(resultData);
        return appData;
    }






/*    НАШ КОД
    public static AppData createAppData() {
        String[] header1 = {"H1", "H2"};
        int[][] data1 = { {1,20},
                          {2,22},
                          {3,33} };
//        myData можно заполнить через Random
        AppData myData;     // создали оболочку с типом AppData
        myData = new AppData (header1, data1);      // создали экземпляр AppData
        return new AppData (header1, data1);    // или return myData
    }

//     1. метод сохранения данных в csv файл;
    public static void myWriter(AppData someData) throws IOException {
        try (FileWriter writer = new FileWriter(pathToFile);) {
//            myWriter.write(someData.getHeader()); // сделать из массива строку

            for (int i = 0; i < someData.getData().length; i++) {
                for (int j = 0; j < someData.getData()[i].length; j++) {
                    writer.write(someData.getData()[i][j]);
                }
                System.getProperty("line.separator");
            }

        }
    }
*/

}
