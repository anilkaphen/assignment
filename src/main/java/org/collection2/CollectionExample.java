package org.collection2;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        List<Integer> list = getAddNumber();

        list.forEach(s -> System.out.println(s));
        List<Integer> list1 = getLinkedList();
        list1.forEach(s -> System.out.println(s));
        Map<Integer, String> map = getHahMap();

        System.out.println("\n\nFor eachloop: ");
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
        for (String s : map.values()) {
            System.out.println(s);
        }

        Set<Integer> set = getTreeList();
        set.forEach(p -> System.out.println(p));
        for (Integer i : set) {
            System.out.println(i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("i" + list.get(i));
        }
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }



    private static List<Integer> getAddNumber() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        return list;
    }

    public static List<Integer> getLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(0);
        return list;
    }

    public static Set<Integer> getTreeList() {
        Set<Integer> set = new TreeSet<Integer>();
        set.add(0);
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(4);
        return set;
    }

    public static Map<Integer, String> getHahMap() {
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
