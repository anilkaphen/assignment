package org.eighteenJan2024;

import org.collection1.Employee;
import java.util.Arrays;
import java.util.List;
public class EmployeeBalance {

    public static void main(String[] args) {

        List<Account> accounts = Arrays.asList( new Account("Mohan",true,"01/03/1995",45678,876,"pune"),
                new Account("Sohan",true,"01/03/1993",45679,875,"patna"),
                new Account("Rohan",true,"02/04/1997",49678,976,"purnia"),
                new Account("raja",true,"06/08/1999",45698,826,"Mumbai"));

          int avg = getAvg(accounts);
         System.out.println("The balance of the List: " + avg);


    }
    private static int getAvg(List<Account> accounts) {
        int sum = 0, avg;
        for(int i = 0; i < accounts.size(); i++)
            sum +=  accounts.get(i).getBalance();
        avg = sum / accounts.size();
        return avg;
    }

}
