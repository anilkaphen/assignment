package org.eighteenJan2024;

import java.util.Map;
import java.util.TreeMap;
public class EmployeeMapExample {

    public static void main(String[] args) {

    }
    private static Map<Integer, Account> getAccountAvgBalance() {
        Map<Integer, Account> map = new TreeMap<>();
        map.put(5, new Account("sohan", true, "01/01/95", 1111, 2022, "patna"));
        map.put(6, new Account("mohan", false, "02/02/2023", 222, 6666, "Gaya"));
        map.put(7, new Account("rohan", true, "03/03/2000", 5555, 606060, "purniya"));
        map.put(8, new Account("tiger", true, "03/03/2003", 5555, 8989, "pune"));
        return map;
    }
}
