package ioliu;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ZiFuRu {
    public static void main(String[] args)  {
        Reader r = null;
        try {
            r = new FileReader("D:\\hello.txt");
            char[] chars = new char[2];
            int len = 0;
            while((len=r.read(chars))!=-1){
                for (int i = 0; i <len ; i++) {
                    System.out.println(chars[i]);

                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(r!=null) {
                try {
                    r.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
