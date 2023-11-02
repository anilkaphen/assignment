package org.november1st2023;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class GradeSystemTest {

    private GradeSystem gradeSystem;

    @Before
    public void setup() {
        gradeSystem = new GradeSystem();
    }

    @Test
    public void CalcPercentGradeForAbove75() {
        Assert.assertEquals(gradeSystem.CalcPercentGrade(75, 75, 75, 75, 75), 75, 76);

    }

    @Test
    public void CalcPercentGradeForAbove60() {

        Assert.assertEquals(gradeSystem.CalcPercentGrade(65, 65, 65, 65, 65), 65, 76);


    }

    @Test
    public void CalcPercentGradeForAbove50() {

        Assert.assertEquals(gradeSystem.CalcPercentGrade(55, 55, 55, 55, 55), 55, 76);


    }

    @Test
    public void CalcPercentGradeForBelow50() {

        Assert.assertEquals(gradeSystem.CalcPercentGrade(45, 45, 45, 45, 45), 45, 46);


    }

}
