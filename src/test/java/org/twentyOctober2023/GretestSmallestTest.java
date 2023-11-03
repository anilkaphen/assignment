package org.twentyOctober2023;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GretestSmallestTest {

    private GretestSmallest gretestSmallest;

    @Before
    public void setup() {
        gretestSmallest = new GretestSmallest();
    }

    @Test
    public void findTwoLargestNumberWhenFirstNumberIsSmall() {

        Assert.assertEquals(gretestSmallest.findTwoLargest(15, 18), 18);
    }

    @Test
    public void findTwoLargestNumberWhenSecondNumberIsSmall() {

        Assert.assertEquals(gretestSmallest.findTwoLargest(28, 25), 28);
    }

    @Test
    public void findLargestForThreeNumber() {

        Assert.assertEquals(gretestSmallest.findLargest(10, 5, 2), 10);
    }

    @Test
    public void findLargestForThreeNumberWhen2ndNumberIsLarge() {

        Assert.assertEquals(gretestSmallest.findLargest(155, 225, 2), 225);
    }

    @Test
    public void findLargestForThreeNumberWhen3rdNumberIsLarge() {

        Assert.assertEquals(gretestSmallest.findLargest(2, 22, 25), 25);
    }

    @Test
    public void findSmallestForFourNumber() {
        Assert.assertEquals(gretestSmallest.findSmallest(14, 15, 6, 10), 6);
    }

    @Test
    public void findSmallestForFourNumberWhen2ndNumberIsSmall() {
        Assert.assertEquals(gretestSmallest.findSmallest(14, 6, 15, 10), 6);


    }

    @Test
    public void findSmallestForFourNumberWhen3rdNumberIsSmall() {
        Assert.assertEquals(gretestSmallest.findSmallest(14, 12, 5, 10), 5);


    }

}
