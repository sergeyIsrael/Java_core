package ForTraining;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTraining {


        public static void main(String[] args) {

                int[][] dataInt = {
                        {1, 200, 300},
                        {2, 222, 333} };

                String dataStr = Arrays.deepToString(dataInt);
                System.out.println(dataStr);
                System.out.println(dataStr.split(";"));
                
                int[] dataInt1 = {1,4,4,5};
                String dataStr1 = Arrays.toString(dataInt1);
                System.out.println(dataStr1);
                System.out.println(dataStr1.split(";"));


                File pathFileDemo = new File("demoL5.txt");
        String javaStr = "Java999";
        byte[] javaByte = javaStr.getBytes(StandardCharsets.UTF_8);
//
        try ( FileOutputStream outDemo = new FileOutputStream(pathFileDemo) ) {
        outDemo.write(javaByte);
        } catch (IOException e) {
                e.printStackTrace();
        }

//        READ in byte array (like buffer)
                byte[] buf = new byte[20];

        try (FileInputStream inDemo = new FileInputStream(pathFileDemo) ) {
                int count;
                count = inDemo.read(buf);
                while ((count = inDemo.read(buf)) != -1) {
                        for (int i = 0; i < count; i++) {
                                System.out.print((char) buf[i]);
                        }
                }
        } catch (IOException e) {
                e.printStackTrace();
          }




        }
}