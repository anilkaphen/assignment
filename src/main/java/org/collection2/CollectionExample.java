package org.collection2;
import java.util.*;
public class CollectionExample {
    public static void main(String[] args) {
        List<Integer> list = getAddNumber();

        list.forEach(s -> System.out.println(s));
        List<Integer> list1 =  getLinkedList();
        list1.forEach(s -> System.out.println(s));
        Map<Integer, String> list2 = getHahMap();
    }
    private static List<Integer> getAddNumber(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        return list;
    }
public static List<Integer> getLinkedList(){
    LinkedList<Integer> list = new LinkedList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(5);
    list.add(0);
    return list;
}
    public static TreeSet<Integer> getTreeList(){
        TreeSet<Integer> list1 = new TreeSet<Integer>();
        list1.add(0);
        list1.add(1);
        list1.add(2);
        list1.add(5);
        list1.add(4);
        return list1;
    }
    public static Map<Integer, String> getHahMap(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "apple");
        map.put(2, "cat");
        map.put(3, "egg");
        map.put(4, "ball");
        map.put(5, "orange");
        map.put(6, "kite");
        map.put(7, "hen");
        map.put(1, "apple1");
        return map;
    }
}
