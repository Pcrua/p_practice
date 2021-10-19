package ioliu;


import java.io.*;
import java.util.Arrays;

/**
 * BufferedInputStream 字节缓冲输入流
 * 加速节点流的 最小可以读8k,最大可以读4G数据
 */
public class BufferedInputStreamDemo {

    public static void main(String[] args) {
        InputStream is = null;
        try {
            is = new BufferedInputStream(new FileInputStream("D:\\hello.txt"));
            byte[] bytes = new byte[4];
            int len=0;
            while ((len=is.read(bytes))!=-1){
                System.out.println(Arrays.toString(Arrays.copyOfRange(bytes,0,len)));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(is!=null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
