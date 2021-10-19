package ioliu;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * 字节输入流 InputStream 抽象类
 * 子类：FileInputStream BufferedInputStream...
 * 作用:适合读取音频 视频等，一次读取8位的数据单元 或者一次读取一个字节数组
 */
public class ZiJieRu {

    public static void main(String[] args){
        InputStream is = null;
        //要求文件必须在路径中存在，否则报文件找不到异常
        try {
            is = new FileInputStream("D:\\HelloIO.txt");
            //此变量用来接收读到的数据
            byte[] bytes = new byte[5];
            int len=0;  //用来保存每次读到的长度，然后给-1比较，然后打印的是
            while((len = is.read(bytes))!=-1){
                System.out.println(Arrays.toString(Arrays.copyOfRange(bytes,0,len)));
            }
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
