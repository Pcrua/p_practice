package changyonglei;

import java.util.Objects;

/**
 * Objects工具类
 */
public class ObjectsDemo {
    public static void main(String[] args) {
        //计算某些对象的hashcode方法
        System.out.println(Objects.hash("abcd")); //2987105
        //判断某些对象是不是为空
        System.out.println(Objects.isNull("abcd"));  //false
    }
}
