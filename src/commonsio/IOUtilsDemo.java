package commonsio;

import org.apache.commons.io.IOUtils;

import java.io.*;

public class IOUtilsDemo {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("D:\\hello.txt");
        OutputStream os = new FileOutputStream("D:\\hellobat.txt");
        //拷贝文件
        IOUtils.copy(is,os);
        //拷贝超过2G的大文件
        IOUtils.copyLarge(is,os);
        //给指定流加缓冲区
        BufferedInputStream bufferedInputStream = IOUtils.buffer(is);


    }
}
