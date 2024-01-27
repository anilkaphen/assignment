package org.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        //arrayListExample();
        //linkedListExample();

        List<Employee> list = getEmployees();

        list.forEach(s -> System.out.println(s));
    }

    private static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Manoj", 30, 8000, true, "Pune"));
        list.add(new Employee(2, "Gopi", 40, 12000, true, "Muz"));
        list.add(new Employee(3, "Pankaj", 50,9000, true, "Patna"));
        list.add(new Employee(4, "Ram", 35,00, true, "Delhi"));
        list.add(new Employee(5, "Shyam", 45,00, true, "Rachi"));
        list.add(new Employee(6, "mohan", 55,00, true, "Bombay"));
        return list;
    }

    private static void arrayListExample() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("cat");
        list.add("egg");
        list.add("ball");
        list.add("orange");
        list.add("kite");
        list.add("hen");
        list.add("apple");

        //For loop
        System.out.println("For loop: ");
        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }

      //  list.remove("orange");

        System.out.println("\n\nFor eachloop: ");
        for(String str:list){
            System.out.println(str);
        }

        list.remove(0);
        System.out.println("\n\nFor java8: ");
        list.forEach(s -> System.out.println(s));
    }

    private static void linkedListExample() {
        List<String> list = new LinkedList<>();
        list.add("apple");
        list.add("cat");
        list.add("egg");
        list.add("ball");
        list.add("orange");
        list.add("kite");
        list.add("hen");
        list.add("apple");

        //For loop
        System.out.println("For loop: ");
        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("\n\nFor eachloop: ");
        for(String str:list){
            System.out.println(str);
        }

        list.remove(0);
        System.out.println("\n\nFor java8: ");
        list.forEach(s -> System.out.println(s));
    }


}
