package com.neo.method.toString;

public class DemoToString {

//  The toString method is used to return a string representation of an object

//  In summary, if you try to call an object, it will call the toString method


    public static void main(String[] args) {
        Student s1 = new Student(11, "Josh");
        System.out.println(s1.rollno);
        System.out.println(s1.sname);



//                      Here you are calling an object. (If you delete the toString method below,
//                      you will see a string representation of this object in syso)

//                          |
        System.out.println(s1);
    }

}

//                    This is by default!
//                      |
class Student extends Object {

    int rollno;
    String sname;

    public Student(int rollno, String sname) {
        this.rollno = rollno;
        this.sname = sname;
    }

//     Notice what prints out when you delete the method below
//      |
    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", sname='" + sname + '\'' +
                '}';
    }
}
