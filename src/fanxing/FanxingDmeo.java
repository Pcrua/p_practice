package fanxing;

/**
 * 现在有一个屋子，学生用就是教室，老师用就是会议室。
 * 但是此时还不知道用它做会议室还是教室，所以没办法用代码写死
 * 于时使用泛型，代码如下
 */
public class FanxingDmeo {
    public static void main(String[] args) {
        House<Student> house = new House<>();
        house.setT();
    }
}

class House<T> {
    public T t;

    public void setT() {
        System.out.println(t);
    }
}

class Student {
    int i;
    int q;
}

class Teacher {
    int a;
    int b;
}
