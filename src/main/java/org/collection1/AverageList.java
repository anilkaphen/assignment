package org.collection1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.averagingDouble;

 public class AverageList {
    public static void main(String[] args) {
       
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Manoj", 30, 8000, true, "Pune"),
                new Employee(2, "Gopi", 40, 12000, true, "Muz"),
                new Employee(3, "Sohan", 50,00, true, "Mumbai"),
                new Employee(3, "Pankaj", 52,9000, true, "Patna")
        );
        List<Employee> list1 = getEmployeeByCity(employees, "Mumbai");
        System.out.println(list1);
      // int avg = getAvg(employees);
       // System.out.println("The average of the List: " + avg);


}

     private static int getAvg(List<Employee> employees) {
         int sum = 0, avg;
         for(int i = 0; i < employees.size(); i++)
             sum +=  employees.get(i).getSalary();
         avg = sum / employees.size();
         return avg;
     }


     private static List<Employee> getEmployeeByCity(List<Employee> employees, String city)

     {
         List<Employee> list = new ArrayList<>();
         for (Employee e: employees) {
             if(e.getCity().equals(city)) {
                 list.add(e);
             } }
         return list;
     }
 }
