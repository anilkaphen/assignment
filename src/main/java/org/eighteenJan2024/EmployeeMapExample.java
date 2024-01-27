package org.eighteenJan2024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeMapExample {

    public static void main(String[] args) {
        EmployeeMapExample employeeBalance = new EmployeeMapExample();
        Map<Integer, Account> map = employeeBalance.getAccountAvgBalance();

        double avg = employeeBalance.getAvg(map);
        System.out.println("Average: "+avg);

        List<Account> list1 = employeeBalance.getBalanceByCity(map, "pune");
        System.out.println("The balance of the city: " + list1);
    }

    public Map<Integer, Account> getAccountAvgBalance() {
        Map<Integer, Account> map = new HashMap<>();
        map.put(5, new Account("sohan", true, "01/01/95", 1111, 5000, "patna"));
        map.put(6, new Account("mohan", false, "02/02/2023", 222, 6000, "pune"));
        map.put(7, new Account("rohan", true, "03/03/2000", 5555, 7000, "purniya"));
        map.put(8, new Account("tiger", true, "03/03/2003", 5555, 2000, "pune"));

        return map;
    }

    public int getAvg(Map<Integer, Account> map) {
        int sum = 0;
        for (Map.Entry<Integer, Account> e : map.entrySet()) {
            sum = sum + e.getValue().getBalance();
        }
        return sum / map.size();
    }

    public List<Account> getBalanceByCity(Map<Integer, Account> map, String city) {
        List<Account> list = new ArrayList<>();
        for (Account e : map.values()) {
            if (e.getCity().equals(city)) {
                list.add(e);
            }
        }
        return list;
    }
}

