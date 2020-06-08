package com.neo.regex;

import java.util.regex.*;

public class RegularExpressions {


    public static void main(String[] args) {
        String longString = "Derek Banas CA 12345 PA (412) 348-2342 johnsmithy@hotmail.com (532) 424-3824 ";
        String strangString = " 1Z aaa **** ***  {{{ {{ { ";
    }



    public static void regexChecker(String theRegex, String str2Check) {

        Pattern checkRegex = Pattern.compile(theRegex);

        Matcher regexMatcher = checkRegex.matcher(str2Check);

    }
}



