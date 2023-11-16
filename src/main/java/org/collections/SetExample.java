package org.collections;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        treeSetExample();
//        hashSetExample();
//        linkedHashSetExample();
//
//        Set<Employee> list = getEmployees();
//        list.forEach(s -> System.out.println(s));
    }

    private static Set<Employee> getEmployees() {
        Set<Employee> set = new HashSet<>();
        set.add(new Employee(1, "Manoj", 30, 8000, true, "Pune"));
        set.add(new Employee(2, "Gopi", 40, 12000, true, "Muz"));
        set.add(new Employee(3, "Pankaj", 50, 9000, true, "Patna"));
        set.add(new Employee(1, "Manoj", 30, 8000, true, "Pune"));

        return set;
    }

    private static void hashSetExample() {
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("cat");
        set.add("egg");
        set.add("ball");
        set.add("orange");
        set.add("kite");
        set.add("hen");
        set.add("apple");

        System.out.println("\n\nFor eachloop: ");
        for(String str:set){
            System.out.println(str);
        }

        set.remove(0);
        System.out.println("\n\nFor java8: ");
        set.forEach(s -> System.out.println(s));
    }

    private static void linkedHashSetExample() {
        Set<String> list = new LinkedHashSet<>();
        list.add("apple");
        list.add("cat");
        list.add("egg");
        list.add("ball");
        list.add("orange");
        list.add("kite");
        list.add("hen");
        list.add("apple");

        System.out.println("\n\nFor eachloop: ");
        for(String str:list){
            System.out.println(str);
        }

        list.remove(0);
        System.out.println("\n\nFor java8: ");
        list.forEach(s -> System.out.println(s));
    }

    private static void treeSetExample() {
        Set<String> list = new TreeSet<>();
        list.add("apple");
        list.add("cat");
        list.add("egg");
        list.add("ball");
        list.add("orange");
        list.add("kite");
        list.add("hen");
        list.add("apple");

        System.out.println("\n\nFor eachloop: ");
        for(String str:list){
            System.out.println(str);
        }

        list.remove("apple");
        System.out.println("\n\nFor java8: ");
        list.forEach(s -> System.out.println(s));
    }
}
