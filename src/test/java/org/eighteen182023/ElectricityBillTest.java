package org.eighteen182023;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ElectricityBillTest {
    private ElectricityBill electricityBill;

    @Before
    public void setup(){
        electricityBill = new ElectricityBill();
    }

    @Test
    public void calculateElectricityBillV2WhenUnitsIs200() {
        Assert.assertEquals(electricityBill.calculateElectricityBillV2(200), 3000);
    }

    @Test
    public void calculateElectricityBillV2WhenUnitsIs80() {
        Assert.assertEquals(electricityBill.calculateElectricityBillV2(80), 800);
    }

    @Test
    public void calculateElectricityBillV2WhenUnitsIs400() {
        Assert.assertEquals(electricityBill.calculateElectricityBillV2(400), 10000);
    }
}
