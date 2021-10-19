package ioliu;

import java.io.*;
import java.util.Arrays;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        Reader r = null;
        try {
            r = new BufferedReader(new FileReader("D:\\hello.txt"));
            char[] chars = new char[4];
            int len =0;
            while (((len = r.read(chars))!=-1)){
                System.out.println(Arrays.toString(Arrays.copyOfRange(chars, 0, len)));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(r!=null){
                try {
                    r.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
