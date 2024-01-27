package org.collection1;

import java.util.Arrays;
import java.util.List;

public class HighestSallery {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Manoj", 30, 8000, true, "Pune"),
                new Employee(2, "Gopi", 40, 12000, true, "Muz"),
                new Employee(3, "Pankaj", 50, 00, true, "Patna"),
                new Employee(3, "Pankaj", 50, 9000, true, "Patna")
        );
        int sum = 0;
        for (int i = 0; i < employees.size(); i++) {
            sum += employees.get(i).getSalary();
        }
        System.out.println("average =" + sum / employees.size());
        int max = -1;
        for (Employee e : employees) {
            if (max < e.getSalary()) {
                max = e.getSalary();
            }

        }
        System.out.println("max salary = " + max);


        int maxSalary = employees.stream()
                .map(Employee::getSalary)
                .max(Integer::compare).get();
        // System.out.println("Max salary of the employee:" + maxSalary);
        // System.out.print("Employee details:");
    }

}
