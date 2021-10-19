package arraydemo;

import java.util.Arrays;

/**
 * 数组的增删查改
 */
public class ArrayDemo {

    public static int capacity = 10;  //用变量定义数组容量，形成可变数组
    public static int[] array = new int[capacity];  //全局定义一个数组
    //类中的全局静态变量的值被此类中的所有方法共享（静态方法+实例方法）
    public static int size;   //定义数组中元素的实际个数

    public static void main(String[] args) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < 13; i++) {
            add(i);
        }
        insert(2, 50);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 向数组最后位置添加元素 并返回存储数组的索引
     *
     * @param e
     * @return
     */
    public static int add(int e) {
        if (size >= capacity) {
            //进行扩容
            ensureEnough();
        }
        array[size++] = e;
        return size;
    }

    /**
     * 根据索引删除数组中的元素
     * @param index
     * @return
     */
    public static int deleteByIndex(int index) {
        //判断下标是不是可用
        if (index > size || index < 0)
            System.out.println("数组下标越界");
        //将指定位置以后的元素前移
        for (int i = index; i < size-1; i++) {
            array[i] = array[i + 1];
        }
        array[size-1]=0;
        size--;
        return size;
    }

    /**
     * 返回数组中e对应得索引，只返回第一个
     * @param e
     * @return
     */
    public  static  int contain(int e){
        for (int i = 0; i <size ; i++) {
            if (e==array[i])
                return i;
        }
        return -1;
    }

    /**
     * 向数组指定位置添加元素，并返回数组当前实际长度
     *
     * @param index
     * @param number
     * @return
     */
    public static int insert(int index, int number) {
        //判断索引是否有问题
        if (index > size || index < 0)
            System.out.println("输入索引无效");
        //判断容量是不足够
        if (size >= capacity)
            ensureEnough();
        //将指定下标及之后的元素后移
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];

        }
        array[index] = number;
        return size;
    }

    /**
     * 将数组扩容为原来的150%
     */
    public static void ensureEnough() {
        capacity += capacity >> 1;
        int[] newArray = new int[capacity];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }



}
