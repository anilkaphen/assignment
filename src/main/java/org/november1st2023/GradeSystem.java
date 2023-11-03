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

        if (average >= 75 && sub1>=75 && sub2>=75 && sub3>=75 && sub4>=75 && sub5>=75) {
            percentage = total / 500 * 100;
            return percentage;
        } else if (average >= 60 && sub1>=60 && sub2>=60 && sub3>=60 && sub4>=60 && sub5>=60) {
            percentage = total / 500 * 100;
            return percentage;
        } else if (average >= 50 && sub1>=50 && sub2>=50 && sub3>=50 && sub4>=50 && sub5>=50) {
            percentage = total / 500 * 100;
            return percentage;
        } else if (average <= 40 && sub1>=50 && sub2>=40 && sub3>=40 && sub4>=50 && sub5>=50) {
            percentage = total / 500 * 100;
            return percentage;
        } else
            return percentage;


    }
}

