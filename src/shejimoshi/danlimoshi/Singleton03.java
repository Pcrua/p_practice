package shejimoshi.danlimoshi;

/**
 * 饿汉式 线程不安全
 * 1.声明一个私有的本类类型的静态变量instance,指向本类对象
 * 2.私有化构造方法
 * 3.创建一个公共的返回本类类型的公共方法 getInstance，返回insntance即可
 */
public class Singleton03 {
    private static Singleton03 instance = new Singleton03();

    private Singleton03() {
    }

    public static Singleton03 getInstance(){
        return instance;
    }
}
