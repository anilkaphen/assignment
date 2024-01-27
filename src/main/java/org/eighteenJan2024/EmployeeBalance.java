package org.eighteenJan2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeBalance {
    public static void main(String[] args) {
        EmployeeBalance employeeBalance = new EmployeeBalance();

        List<Account> accounts = Arrays.asList(new Account("Mohan", true, "01/03/1995", 45678, 876, "pune"),
                new Account("Sohan", true, "01/03/1993", 45679, 890, "patna"),
                new Account("Rohan", true, "02/04/1997", 49678, 976, "purnia"),
                new Account("raja", true, "06/08/1999", 45698, 826, "Mumbai"),
                new Account("xyz", true, "06/08/1991", 45698, 917, "chennai"),
                new Account("abc", true, "06/08/1992", 48698, 1025, "gaya"),
                new Account("naman", true, "06/08/1993", 49698, 8888, "muzaffarpur"),
                new Account("tannu", true, "06/08/1994", 45098, 9999, "indore"),
                new Account("anshu", true, "06/08/1989", 40098, 1000, "delhi"));

        int avg = employeeBalance.getAvg(accounts);
        System.out.println("The balance of the List: " + avg);

        List<Account> list1 = getBalanceByCity(accounts, "indore");
        System.out.println("The balance of the city: " + list1);

        List<Account> list2 = getMinBal(accounts, 1000);
        System.out.println("The MIn  city balance: " + list2);
    }

    public int getAvg(List<Account> accounts) {
        int sum = 0, avg;
        for (int i = 0; i < accounts.size(); i++)
            sum += accounts.get(i).getBalance();
        avg = sum / accounts.size();
        return avg;
    }

    private static List<Account> getBalanceByCity(List<Account> accounts, String city) {
        int bal;
        String c;

        List<Account> list = new ArrayList<>();
        for (Account e : accounts) {
            if (e.getCity().equals(city)) {
                list.add(e);
            }
        }
        return list;
    }

    private static List<Account> getMinBal(List<Account> accounts, int balance) {
        int min = 0;
        List<Account> list1 = new ArrayList<>();
        for (Account a : accounts) {
            if (min > a.getBalance()) {
                min = a.getBalance();
            }
        }
        return list1;
    }
}
