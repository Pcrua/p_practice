package shejimoshi.danlimoshi;

/**
 * 懒汉式，线程不安全
 * 1.声明一个私有的本类类型的静态变量instance，不赋初值
 * 2.私有化无参构造
 * 3.声明一个公共的静态方法getInstance 判断instance是不是为空，返回本类
 */
public class Singleton01 {
    private static Singleton01 instance;
    private Singleton01(){}

    public static Singleton01 getInstance(){
        if(instance==null)
            instance = new Singleton01();
        return instance;
    }
}
