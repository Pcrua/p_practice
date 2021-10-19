package fabonacci;

/**
 * 一个兔子从第三个月起每月可以生一个小兔子，
 * 小兔子自出生的第三个月起每月生一个小小兔，
 * 假如兔子都不死，问每个月兔子有多少只？
 * 斐波那契数列: 1 1 2 3 5 8 13 21......
 */
public class Fabonacci {
    public static void main(String[] args) {
        System.out.println(Fabonacci(10));  //8


    }
    public static int Fabonacci(int month){
        if(month==1|| month==2)
            return 1;
        return Fabonacci(month-1)+Fabonacci(month-2);
    }
}
