package ioliu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class ZiFuChu {
    public static void main(String[] args) {
        Writer w = null;
        try {
            w = new FileWriter("D:\\hello.txt");
            w.write("你好");
            w.flush();  //刷新一下才能写到磁盘
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(w!=null) {
                try {
                    w.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }



    }
}
