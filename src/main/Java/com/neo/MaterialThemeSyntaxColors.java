package com.neo;


/**
 * A class showing how colors are linked to syntax.
 *
 * @author  unascribed
 * @since   JDK1.0
 */
public class MaterialThemeSyntaxColors {
    int myVariable;
    static int data = 30;

//                   Keyword
// Access Modifier   |       Class
//    |             |          |
    public static void main(String[] args) {
//           |          |
//        Keyword      |
//                  Method Name

        MaterialThemeSyntaxColors obj = new MaterialThemeSyntaxColors();

//                                                           Rice flower
//                                                            |
        System.out.println("Value of instance variable = " + obj.myVariable);
//                                                                    \
//            Variable                                             Twilight blue
//              |
        System.out.println("Value of static variable = " + MaterialThemeSyntaxColors.data);
    }


    int i;
    public void printLine(int i) {
        this.i = i;
    }
}

