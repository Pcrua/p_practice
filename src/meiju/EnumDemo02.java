package meiju;

/**
 * 教师有一定的级别
 * chuji zhongji youxiu teji
 * 每个级别有对应的数值限定
 * level  1     2   3    4
 * salsry 1000 2000 3000 4000
 */
public enum EnumDemo02 {
    CHUJI(1, 1000),
    ZHONGJI(2, 2000),
    YOUXIU(3, 3000),
    TEJI(4, 4000);

    private int level;  //自定义变量---教师级别
    private int salary; //自定义变量---教师薪资

    //用来初始化对象
    EnumDemo02(int level, int salary) {
        this.level = level;
        this.salary = salary;
    }

    public int getLevel() {
        return level;
    }

    public int getSalary() {
        return salary;
    }
}

//定义一个教师类，其中teacherType是枚举类型的属性
class Teacher {
    public int id;
    public String name;
    public EnumDemo02 teacherType;

    public Teacher(int id, String name, EnumDemo02 teacherType) {
        this.id = id;
        this.name = name;
        this.teacherType = teacherType;
    }
}

//定义测试类，枚举中的
class test {
    public static void main(String[] args) {
        Teacher t = new Teacher(1, "lisi", EnumDemo02.TEJI);
        System.out.println(t.teacherType.getSalary()); //4000

        //name()返回枚举变量的名称
        System.out.println(EnumDemo02.TEJI.name()); //TEJI
        /**
         * 它的作用是传来一个字符串，然后将它转变为对应的枚举变量。
         * 前提是你传的字符串和定义枚举变量的字符串一抹一样，区分大小写。
         * 如果你传了一个不存在的字符串，那么会抛出异常。
         */
        System.out.println(EnumDemo02.valueOf("TEJI")); //TEJI
        //这个方法会返回包括所有枚举变量的数组
        System.out.println(EnumDemo02.values()[0]);//CHUJI
        /**
         * 默认请款下，枚举类会给所有的枚举变量一个默认的次序，该次序从0开始，类似于数组的下标。
         * 而.ordinal()方法就是获取这个次序（或者说下标）
         */
        System.out.println(EnumDemo02.CHUJI.ordinal());  //0

        /**
         * 该方法用来比较两个枚举变量的”大小”，实际上比较的是两个枚举变量的次序，
         * 返回两个次序相减后的结果，如果为负数，就证明变量1”小于”变量2
         */
        System.out.println(EnumDemo02.CHUJI.compareTo(EnumDemo02.TEJI));  //-3
    }
}