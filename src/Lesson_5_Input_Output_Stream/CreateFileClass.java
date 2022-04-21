package Lesson_5_Input_Output_Stream;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CreateFileClass {

    public static final String pathToFile = "/Users/Mac/IdeaProjects/Java core/Java_core/src/resources/demo.csv";
    public static final String REGEX = ";";
    public static final String PROBEL = " ";
    public static final int LENGTH_ROW = 9;
    public static final int LENGTH_COLUMN = 9;
    public static final int MAX_RANDOM_VALUE = 100;


    public static void main(String[] args) throws Exception {

        write(generate());  //  записали то, что нагенерили
        print(read());    //  вывели в консоль то, что считали
    }
    private static AppData generate() {
        /*
        Random код в диапазоне чисел от 2 до 8:
        Random random = new Random();
        int min = 2;
        int max = 9;
        int randomNumberRange = random.nextInt(max-min) + min;
         */
        Random random = new Random();

        int lengthRow = random.nextInt(LENGTH_ROW) + 1;// + 1 тк размер 0 не может быть
        String[] header = new String[lengthRow];
        for (int i = 0; i < lengthRow; i++) {
            header[i] = "H" + (i + 1);
        }

        int lengthColumn = random.nextInt(LENGTH_COLUMN) + 1; // + 1 тк размер 0 не может быть
        int[][] data = new int[lengthColumn][lengthRow];
        for (int i = 0; i < lengthColumn; i++) {
            for (int j = 0; j < lengthRow; j++) {
                data[i][j] = random.nextInt(MAX_RANDOM_VALUE);
            }
        }
        return new AppData(header, data);
    }


    private static void print(AppData anyAppData) {
        for (int i = 0; i < anyAppData.getHeader().length; i++) {
            if (i != anyAppData.getHeader().length-1) { // убираем последний пробел
                System.out.print(anyAppData.getHeader()[i] + PROBEL);
            } else {
                System.out.print(anyAppData.getHeader()[i]);
            }
        }
        System.out.println();

        for (int i = 0; i < anyAppData.getData().length; i++) {
            for (int j = 0; j < anyAppData.getData()[i].length; j++) {

                if (j != anyAppData.getData()[i].length-1) {    // убираем последний пробел
                    System.out.print(anyAppData.getData()[i][j] + PROBEL);
                } else {
                    System.out.print(anyAppData.getData()[i][j]);
                }
            }
            System.out.println();
        }
    }

    private static void write(AppData appData) throws IOException {
        StringBuilder headerSbSemicolon = new StringBuilder();
        for (int i = 0; i < appData.getHeader().length; i++) {
            headerSbSemicolon.append(appData.getHeader()[i]).append(REGEX);
        }

        try (FileWriter fileWriter = new FileWriter(pathToFile)) {
            fileWriter.write(headerSbSemicolon + "\n");

            for (int i = 0; i < appData.getData().length; i++) {
                for (int j = 0; j < appData.getData()[i].length; j++) {
                        fileWriter.write(appData.getData()[i][j] + REGEX);
                }
                fileWriter.write(System.getProperty("line.separator"));
            }
        }
    }

    public static AppData read() throws IOException {
        AppData appData = new AppData();
        List <List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            String line = br.readLine();
            appData.setHeader(line.split(REGEX));
            while ((line = br.readLine()) != null) {
                String[] values = line.split(REGEX);
                records.add(Arrays.asList(values));
            }
        }

        int[][] resultData = new int[records.size()][records.get(0).size()];

        for (int i = 0; i < records.size(); i++) {
            for (int j = 0; j < records.get(i).size(); j++) {
                resultData[i][j] = Integer.parseInt(records.get(i).get(j));
            }
        }
        appData.setData(resultData);
        return appData;
    }
}