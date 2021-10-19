package sorts;

import java.util.Arrays;

/**
 * 数组十大排序之冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 90 + 10);
        }
        System.out.println("未排序的数组是：" + Arrays.toString(arr));
        sortBubble(arr);
        System.out.println("排好序的数组是："+Arrays.toString(arr));
    }

    public static void sortBubble(int[] arr) {
        int temp;
        //遍历数组
        for (int i = 0; i <arr.length ; i++) {
            //让相邻两个元素互相比较，交换位置。注意边界位置，不要下标越界
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
