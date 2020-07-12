package iterator;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 主要演示下不同的遍历方式效率的区别
 */
public class Test {

    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        for (int i = 0; i < 10000; i++) {
            list.add("test"+i);
        }

        Iterator<String> it = list.iterator();
        long l = System.currentTimeMillis();
        while (it.hasNext()){
            String str = it.next();
        }
        long l1 = System.currentTimeMillis();
        System.out.println("使用迭代器遍历集合所用时间："+(l1-l)+"毫秒");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
        }
        long l2 = System.currentTimeMillis();
        System.out.println("使用get(i)遍历集合所用时间："+(l2-l1)+"毫秒");

    }
}
