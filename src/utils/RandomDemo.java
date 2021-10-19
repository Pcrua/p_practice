package utils;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        //生成一个[0,1)之间的伪随机数
        System.out.println(Math.random());
        //生成0~100之间的随件整数
        int a = (int) (Math.random() * 101);
        System.out.println(a);
        /**
         * Math.random() * 43)  取0~42.9999999999
         * +18 则是 18~60.9999999999
         * 强转int 变成[18,60]
         * 规律：[min,max] --> Math.random()*(max-min+1) +min
         */
        int i = (int) (Math.random() * 43) + 18;  //生成18~60之间的随件整数
        System.out.println(i);


        System.out.println("==========================");

        Random random = new Random();
        random.nextInt(10);  //获取[0,10)之间的随机整数
    }
}
