package meiju;

/**
 * 枚举在switch中的使用
 */
enum Singal {
    GREEN, RED, BLUE;
}

public class EnumDemo03 {
    public static void main(String[] args) {
        change();
    }

    static Singal color = Singal.BLUE;
    public static void change(){
        switch (color){
            case RED:
                color=Singal.BLUE;
                System.out.println(color);
                break;
            case BLUE:
                color=Singal.RED;
                System.out.println(color);
                break;
            case GREEN:
                color=Singal.GREEN;
                break;
        }
    }
}
