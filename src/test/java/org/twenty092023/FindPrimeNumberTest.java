package org.twenty092023;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindPrimeNumberTest {

    private FindPrimeNumber findPrimeNumber;

    @Before
    public void setup(){
        findPrimeNumber = new FindPrimeNumber();
    }

    @Test
    public void findPrimeNumberForGivenRangeWhenNumberIsNotPrime() {
        Assert.assertEquals(findPrimeNumber.isPrimeNumber(8), false);
    }

    @Test
    public void findPrimeNumberForGivenRangeWhenNumberIsPrime() {
        Assert.assertEquals(findPrimeNumber.isPrimeNumber(7), true);
    }
}
