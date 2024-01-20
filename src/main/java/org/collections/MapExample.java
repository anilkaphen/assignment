package org.collections;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
//        hashMapExample();
//      linkedHashMapExample();
        treeHashMapExample();

      //  Map<Integer, Employee> map  = getEmployees();
      //  map.forEach((k, v) -> System.out.println("Key: " + k + " ,Value: " + v));
    }

    private static Map<Integer, Employee> getEmployees() {
        Map<Integer, Employee> map = new TreeMap<>();
        map.put(11, new Employee(1, "Manoj", 30, 8000, true, "Pune"));
        map.put(2, new Employee(2, "Gopi", 40, 12000, true, "Muz"));
        map.put(6, new Employee(3, "Pankaj", 50, 9000, true, "Patna"));
        map.put(1, new Employee(1, "Manoj", 30, 8000, true, "Pune"));

        return map;
    }

    private static void hashMapExample() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "apple");
        map.put(2, "cat");
        map.put(3, "egg");
        map.put(4, "ball");
        map.put(5, "orange");
        map.put(6, "kite");
        map.put(7, "hen");
        map.put(1, "apple1");

        System.out.println("\n\nFor eachloop: ");
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        map.remove(0);
        System.out.println("\n\nFor java8: ");
        map.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
    }

    private static void linkedHashMapExample() {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "apple");
        map.put(2, "cat");
        map.put(3, "egg");
        map.put(4, "ball");
        map.put(5, "orange");
        map.put(6, "kite");
        map.put(7, "hen");
        map.put(1, "apple1");

        System.out.println("\n\nFor eachloop: ");
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        map.remove(0);
        System.out.println("\n\nFor java8: ");
        map.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
    }

    private static void treeHashMapExample() {
        Map<Integer, String> map = new TreeMap<>();
        map.put(5, "orange");
        map.put(2, "cat");
        map.put(3, "egg");
        map.put(6, "kite");
        map.put(7, "hen");
        map.put(1, "apple");
        map.put(1, "apple1");
        map.put(4, "ball");

        System.out.println("\n\nFor eachloop: ");
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        map.remove(0);
        System.out.println("\n\nFor java8: ");
        map.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
    }
}
