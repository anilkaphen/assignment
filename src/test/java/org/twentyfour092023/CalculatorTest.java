package org.twentyfour092023;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest extends TestCase {
    Calculator calc = new Calculator();

    public void setUp() throws Exception {
        super.setUp();
    }@Before
    public  void runBeforeEveryTest(){
        calc.result=0;


}
  public void testName() {
    }

    public void tearDown() throws Exception {
    }
@Test
    public void testAdd() throws  Exception{
    calc.add(20,5);
    assertEquals(calc.result,25);
    }

    @Test
    public void testSubtract() {
        calc.subtract(10,10);
        assertEquals(calc.result,0);
    }
@Test
    public void testMultiply()throws  Exception {
        calc.multiply(20,5);
        assertEquals(calc.result,100);

    }
    @Test
    public void testDivide()throws  Exception {
        calc.divide(10,2);
        assertEquals(calc.result,5);
    }
}