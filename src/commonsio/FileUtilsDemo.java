package commonsio;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileUtilsDemo {
    public static void main(String[] args) throws IOException {
        //输入一个long类型的数字，转换为文件大小
        System.out.println(FileUtils.byteCountToDisplaySize(1024 * 1024 * 4));
        //清空指定文件夹
        FileUtils.cleanDirectory(new File("D:\\003"));
        //拷贝文件夹
        FileUtils.copyDirectory(new File("D:\\001"),new File("D:\\002"));
        //拷贝文件
        FileUtils.copyFile(new File("D:\\001\\1.txt"),new File("D:\\002\\2.txt"));
    }
}
