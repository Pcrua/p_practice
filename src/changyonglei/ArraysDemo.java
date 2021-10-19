package changyonglei;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,99,5,6,7,8,9};
        int[] arr2 = {1,2,3,4,5,6,7,8,9};

        System.out.println(Arrays.toString(arr1)); //返回指定数组内容的字符串表示形式
        System.out.println(Arrays.equals(arr1, arr2));//比较两个数组是不是相同

        int[] arr3 = new int[10];
        Arrays.fill(arr3, (int) (Math.random()*101));  //将指定数字填充到指定数组
        System.out.println(Arrays.toString(arr3));

        int[] num4 = Arrays.copyOf(arr1,20);   //将指定数组的内容复制到另一个数组，并指定新数组的容量。数组扩容常用
        System.out.println(Arrays.toString(num4));

        Arrays.sort(arr1);  //对指定数组按照数字顺序排序
        System.out.println(Arrays.toString(arr1));

    }
}
