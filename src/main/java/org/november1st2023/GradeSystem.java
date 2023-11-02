package org.november1st2023;

public class GradeSystem {

    public static void main(String[] args) {

        int sub1 = 100;
        int sub2 = 100;
        int sub3 = 100;
        int sub4 = 100;
        int sub5 = 100;

        GradeSystem gradeSystem = new GradeSystem();

        gradeSystem.CalcPercentGrade(sub1, sub2, sub3, sub4, sub5);
    }


    public int CalcPercentGrade(int sub1, int sub2, int sub3, int sub4, int sub5) {

        int total;
        int average;
        int percentage;
        char grade;

        total = sub1 + sub2 + sub3 + sub4 + sub5;
        average = total / 5;
        percentage = total / 500 * 100;

        if (average >= 75) {
            percentage = total / 500 * 100;
            return percentage;
        } else if (average >= 60) {
            percentage = total / 500 * 100;
            return percentage;
        } else if (average >= 50) {
            percentage = total / 500 * 100;
            return percentage;
        } else if (average <= 40) {
            percentage = total / 500 * 100;
            return percentage;
        } else
            return percentage;


    }
}

