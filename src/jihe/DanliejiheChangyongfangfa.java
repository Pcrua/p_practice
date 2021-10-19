package jihe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Collection接口和List接口的常用方法
 */
public class DanliejiheChangyongfangfa {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println("=============Collection常见方法===============");
        //添加元素
        list.add("aa");
        list.add("bb");
        //根据对象名删除元素，返回布尔
        System.out.println(list.remove("bb"));  //true
        //获取容器大小
        System.out.println(list.size()); // 1
        //判断容器是否为空
        System.out.println(list.isEmpty()); //false
        //是否包含某个元素
        System.out.println(list.contains("aa")); //true
        //转换为数组
        System.out.println(list.toArray());  //[Ljava.lang.Object;@4554617c
        //清空集合
        list.clear();

        System.out.println("============List集合常用方法==============");
        //添加元素
        list.add("java");
        list.add("HTML5");
        list.add("css3");
        //插入元素
        list.add(3, "js");


        //根据索引删除元素，返回被删除元素
        System.out.println(list.remove(2));


        //根据索引获取集合中的元素
        System.out.println(list.get(0));
        //根据对象内容，获取元素在集合中的位置，没有返回-1
        System.out.println(list.lastIndexOf("java"));
        //根据对象内容，获取元素在集合中的位置，没有返回-1
        System.out.println(list.indexOf("java1"));

        //修改元素
        System.out.println(list.set(1, "html5"));

        //初始化静态数组一般可以这样
        List<String> list1 = Arrays.asList("aa", "bb", "cc", "dd", "ee");
        //截取集合,[0,2)
        List<String> list2 = list1.subList(0, 2);
        System.out.println(Arrays.toString(list2.toArray()));

    }
}
