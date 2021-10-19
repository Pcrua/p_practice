package shejimoshi.danlimoshi;

/**
 * 懒汉式 线程安全
 * 只需在公共方法上加synchronized修饰即可
 */
public class Singleton02 {
    private static Singleton02 instance;
    private Singleton02(){}
    public static synchronized Singleton02 getInstance(){
        if (instance==null)
            instance=new Singleton02();
        return instance;
    }
}
