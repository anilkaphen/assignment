package org.november1st2023;

public class GradeSystem {
    public static void main(String[] args) {
        GradeSystem gradeSystem = new GradeSystem();
        System.out.println(gradeSystem.calcPercentGrade(50, 60, 80, 90, 39));
        System.out.println(gradeSystem.calcPercentGrade(50, 60, 80, 90, 60));
    }

    public int calcPercentGrade(int sub1, int sub2, int sub3, int sub4, int sub5) {
        int percentage = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;
        if (sub1 > 40 && sub2 > 40 && sub3 > 40 && sub4 > 40 && sub5 > 40) {
            if (percentage >= 75) {
                System.out.println("Grade A ");
            } else if (percentage >= 60) {
                System.out.println("Grade B ");
            } else if (percentage >= 50) {
                System.out.println("Grade C ");
            } else if (percentage >= 40) {
                System.out.println("Grade D ");
            }
        } else {
            System.out.println("Fail ");
        }
        return percentage;
    }
}

