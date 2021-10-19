package ioliu;


import java.io.*;

public class ZiJieChu {
    public static void main(String[] args) {
        //true表示追加写，false表示覆盖写，默认false
        OutputStream os = null;
        try {
            os = new FileOutputStream("D:\\hello.txt",true);
            byte[] bytes = "你好".getBytes("UTF-8");
            os.write(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(os!=null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        }
    }

