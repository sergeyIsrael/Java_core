package ForTraining;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainTraining {


        public static void main(String[] args) {

                int[][] in = { {1,2,3,4},
                               {2,3,6,5},
                               {3,6,9,7} };
//                System.out.println(in[0].length);

                for (int i = 0; i < in.length; i++) {
                        for (int j = 0; j < in[i].length; j++) {
                                if (j == in[i].length-1 ) { // j max = 3; in[i].length = 4
                                        System.out.print(in[i][j]);
                                } else {
                                        System.out.print(in[i][j] + ", ");
                                }

                        }
                        System.out.println();
                }





        }
}