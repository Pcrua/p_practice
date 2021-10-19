package jihe;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * List集合的两种遍历方式
 */
public class BianliDanlijiehe {
    public static void main(String[] args) {
        //初始化静态数组
        List<String> list = Arrays.asList("aa","bb","cc","dd");
        //第一种遍历方法
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+"\t");
        }
        System.out.println();
        for (String s : list) {
            System.out.print(s+"\t");
        }
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }


    }
}
