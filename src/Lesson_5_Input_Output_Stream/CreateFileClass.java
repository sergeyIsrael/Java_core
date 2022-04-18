package Lesson_5_Input_Output_Stream;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateFileClass {
// от препода
    public static ArrayList<FIleObject> fIleObjectArrayList = new ArrayList<>();
    public static final String title = "value1"+ ";" + "value2"
            + ";" + "value3" + ";"+ System.getProperty("line.separator");
// мой путь к файлу
    public static final String pathToFile = "/Users/Mac/IdeaProjects/Java core/Java_core/src/resources/demo.csv";




    public static void main(String[] args) throws Exception {

        /* НАШ КОД
        AppData myCreatedData = createAppData();
        myWriter(createAppData());
        */


//        нужно записать ЭТО в cvs (с ";")
        String[] header = {"H1", "H2"};
        int[][] data = {{1, 20},
                {2, 22},
                {3, 33}};


//        ставим в header (;) semicolon
        String headerStrSemicolon = "";
        for (int i = 0; i < header.length; i++) {
            headerStrSemicolon += header[i] + "; ";
        }

//        ПЕЧАТЬ
//        System.out.print("header: "); // header
//        for (int i = 0; i < header.length; i++) {
//            System.out.print(header[i] + " ");
//        }
//        System.out.println();
//
//        System.out.println("headerStrSemicolon: " + headerStrSemicolon);


//       1. Пишем в cvs файл
        try (FileWriter fileWriter = new FileWriter(pathToFile)) {
            fileWriter.write(headerStrSemicolon + "\n");     // пишем header
            for (int i = 0; i < data.length; i++) {   // пишем data
                for (int j = 0; j < data[i].length; j++) {
                    fileWriter.write(String.valueOf(data[i][j]) + "; "); // ❓ зачем нужно приводить к строке?
                }
                fileWriter.write(System.getProperty("line.separator"));
            }
        }

        AppData appData = readToAppData();



    } // main close


    //      2. Читаем с cvs файла в App Data
    public static AppData readToAppData() throws Exception {
        AppData appData = new AppData();
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            String line = br.readLine();

            appData.setHeader(line.split(";"));
            while ((line = br.readLine()) != null) {
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
