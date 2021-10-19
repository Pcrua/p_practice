package sorts;

import java.util.Arrays;

public class InsertSort {


    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 90 + 10);
        }
        System.out.println("未排序的数组："+ Arrays.toString(arr));
        sortInsert(arr);
        System.out.println("排好序的数组："+Arrays.toString(arr));
    }

    public static void sortInsert(int[] arr) {
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //让每个元素和其前面的所有元素比较
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
    }
}
