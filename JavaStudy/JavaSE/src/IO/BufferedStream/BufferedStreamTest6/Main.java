package IO.BufferedStream.BufferedStreamTest6;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    //文件修改排序
    static void main() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\b.txt"));

        ArrayList<String> arr = new ArrayList<>();

        String str;
        while ((str = br.readLine()) != null) {
            arr.add(str);
        }

        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                return Integer.parseInt(o1.split("\\.")[0]) - Integer.parseInt(o2.split("\\.")[0]);
            }

        });

        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\c.txt"));

        for (int i = 0; i < arr.size(); i++) {
            bw.write(arr.get(i));
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}
