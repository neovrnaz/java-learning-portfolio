package com.neo.if_statements;

class Classroom {
    private String student;
    private boolean candy;
    private boolean extraCredit;
    private int extraCreditPoints;
    private int testScore;
    private boolean gender;


    public void printName() {
        System.out.println(student);
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getStudent() {
        return student;
    }

    public void setTestscore(int testScore) {
        this.testScore = testScore;
    }

    public void setExtraCredit(boolean extraCredit) {
        this.extraCredit = extraCredit;

    }



    public boolean isExtraCredit() {
        if (extraCredit) {
            testScore = testScore + 10;

            setExtraCredit(extraCredit);
        } return false;
    }



    public void isCandy() {
        if (candy) {
            System.out.println("gets a piece of candy");
        } else {
            System.out.println("No candy for ");
        }
    }




    public boolean getGender() {
        return  gender;
    }

    public void whatGender() {

        if (gender) {
            System.out.println("he");
        } else {
            System.out.println("she");
        }
    }


    public void whatGrade() {
        if (testScore <= 65) {
            System.out.println(student + " got a F on the exam. \n");
        }
        if (testScore >=65) {
            if (testScore <= 69) {
                System.out.println(student + " got a D on the exam. \n");
            }
        }
        if (testScore >= 70) {
            if (testScore <= 79) {
                System.out.println(student + "  got a C on the exam. \n");
            }
        }
        if (testScore >= 80) {
            if (testScore <= 89) {
                System.out.println(student + " got a B on the exam. \n");
            }
        }
        if (testScore >= 90) {
            System.out.println(student + " got a A on the exam. \n");
        }
    }




    public int getTestscore() {


//              Relational Operator
//                     |
        if (testScore == 100) {
//          \              /
//              Condition



            System.out.println(getStudent() + " gets a piece of candy");

    //                         logical operator
    //                               |
        } else if (testScore >= 100 && extraCredit){
            System.out.println(getStudent() + " gets two pieces of candy");
        } else {
            System.out.println("No candy for " + getStudent());
        }
        return testScore;

// Conditional statements are either true or false
    }


//   Constants are usually public. There is no harm in acessing a constant directly, because it can't be changed
//    |
    public static final int MAX_TEST_SCORE = 100;
//          |
//      Constants are usually static

//  All that is "Final" is the reference itself. Not necessarily the data it contains

}



public class GetCandy {
    public static void main(String[] args) {


//              Assignment operator
//                    |
        Classroom max = new Classroom();
        max.setStudent("Max");
        max.setTestscore(100);
        max.setExtraCredit(true);
        max.isExtraCredit();
        max.getTestscore();
        max.whatGrade();
        max.whatGender();

        Classroom suzzy = new Classroom();
        suzzy.setStudent("Suzzy");
        suzzy.setTestscore(90);
        suzzy.setExtraCredit(true);
        suzzy.isExtraCredit();
        suzzy.getTestscore();
        suzzy.whatGender();

    }
}