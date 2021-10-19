package sorts;

import java.util.Arrays;

/**
 * 数组十大排序之选择排序
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 90 + 10);
        }
        System.out.println("未排序的数组："+Arrays.toString(arr));
        sortSelect(arr);
        System.out.println("排好序的数组："+Arrays.toString(arr));
    }

    public static void sortSelect(int[] arr) {
        int temp;
        //遍历数组
        for (int i = 0; i <arr.length ; i++) {
            //从第i+1个元素开始比较
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]>arr[j]){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
            }
        }

    }
}
