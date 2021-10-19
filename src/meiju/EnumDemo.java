package meiju;

/**
 * 使用规则：
 * 使用enum关键字定义一个枚举类
 * 枚举类中直接大写变量名就行
 * 在要使用枚举的类中定义一个枚举类型的变量
 * 使用时直接枚举类名.变量名即可
 * 枚举的作用：圈定一个范围，将数值限定在这个范围内
 * 枚举类不能继承其他类，因为已经继承了Enum类，并且 枚举类默认被final修饰，所以他也不能被其他类继承
 * 枚举对象不管使用多少次，在内存中都只有一份，枚举类被加载时创建
 */
public enum EnumDemo {
    GREEN,RED,BLUE;
}
class Emp{
    String name;
    EnumDemo state;

    public Emp() {
    }

    public Emp(String name, EnumDemo state) {
        this.name = name;
        this.state = state;
    }

    public static void main(String[] args) {
        Emp emp =new Emp("lisi",EnumDemo.GREEN);

    }
}
