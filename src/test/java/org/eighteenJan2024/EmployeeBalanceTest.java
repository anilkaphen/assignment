package org.eighteenJan2024;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class EmployeeBalanceTest {
    private EmployeeBalance employeeBalance;
    private List<Account> accounts;
    @Before
    public void setup() {
        employeeBalance = new EmployeeBalance();
        accounts = Arrays.asList(new Account("Mohan", true, "01/03/1995", 45678, 876, "pune"),
                new Account("Sohan", true, "01/03/1993", 45679, 890, "patna"),
                new Account("Rohan", true, "02/04/1997", 49678, 976, "purnia"),
                new Account("raja", true, "06/08/1999", 45698, 826, "Mumbai"),
                new Account("xyz", true, "06/08/1991", 45698, 917, "chennai"),
                new Account("abc", true, "06/08/1992", 48698, 1025, "gaya"),
                new Account("naman", true, "06/08/1993", 49698, 8888, "muzaffarpur"),
                new Account("tannu", true, "06/08/1994", 45098, 9999, "indore"),
                new Account("anshu", true, "06/08/1989", 40098, 1000, "delhi"));

    }
    @Test
    public void AvgBalanceForEmployee() {
//        employeeBalance.getAvg(accounts);
//                Assert.assertEquals(employeeBalance.);
    }
    @Test
    public void EmployeeBalanceByCity() {
//        employeeBalance.
//           //     Assert.assertEquals(employeeBalance.result, 3);
    }
    @Test
    public void EmployeeMinBalance() {
//        employeeBalance.
//             //   Assert.assertEquals(employeeBalance.result, 40);
    }
}
