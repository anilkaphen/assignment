package org.november7th2023;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TelephoneBillTest {
    private TelephoneBill telephoneBill ;

    @Before
    public void setup(){
        telephoneBill = new TelephoneBill();
    }

    @Test
    public void calculateElectricityBillV2WhenUnitsIs200() {
        Assert.assertEquals(telephoneBill.calculateTelephoneBill(100),185);
    }

    @Test
    public void calculateTelephoneBillWhenCallIs80() {
        Assert.assertEquals(telephoneBill.calculateTelephoneBill(150), 225);
    }

    @Test
    public void calculateTelephoneBillWhenCallIs400() {
        Assert.assertEquals(telephoneBill.calculateTelephoneBill(300), 385);
    }
}
