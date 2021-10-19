package yichang;

/**
 * 自定义异常的步骤：
 * 1.定义一个类，ectends 现有的异常结构，如 Exception 或 RuntimeException
 * 2.提供重载的构造器
 */
public class MyException extends RuntimeException{

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
