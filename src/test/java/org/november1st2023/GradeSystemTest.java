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
        Assert.assertEquals(gradeSystem.calcPercentGrade(75, 80, 78, 92, 95), 84);
    }
    @Test
    public void CalcPercentGradeForAbove75ButoneSubjectBelow40() {
        Assert.assertEquals(gradeSystem.calcPercentGrade(75, 80, 38, 92, 95), 76);
    }
    @Test
    public void CalcPercentGradeForAbove40Below50() {
        Assert.assertEquals(gradeSystem.calcPercentGrade(48, 54, 53, 45, 50), 50);
    }
    @Test
    public void CalcPercentGradeForAbove40Below50neSubjectBelow40Marks() {
        Assert.assertEquals(gradeSystem.calcPercentGrade(40, 45, 45, 45, 45), 44);
    }
    @Test
    public void CalcPercentGradeForabove40Below50() {
        Assert.assertEquals(gradeSystem.calcPercentGrade(45, 45, 45, 45, 45), 45);
    }
    @Test
    public void CalcPercentGradeForAbove60Below75() {
        Assert.assertEquals(gradeSystem.calcPercentGrade(65, 70, 68, 62, 70), 67);
    }
    @Test
    public void CalcPercentGradeForAbove60Below75OneSubjectBelow40() {
        Assert.assertEquals(gradeSystem.calcPercentGrade(35, 70, 68, 62, 70), 61);
    }
    @Test
    public void CalcPercentGradeForABelow40() {
        Assert.assertEquals(gradeSystem.calcPercentGrade(35, 30, 25, 40, 20), 30);
    }}

