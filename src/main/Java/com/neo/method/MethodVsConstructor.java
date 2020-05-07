package com.neo.method;






class MethodVsConstructor {

    private static String constructor = "test";


// A constructor is a method that will run when you instantiate a class
// Instantiation happens when you create a new instance of a class


// A method header contains information about a methods access, return type, name and parameters (the variables that the method will use)

//         Method Name       Parameters
//                  \       /
    public void methodName() {
//               \        /
//             Method signature is the name of a method and parameter list. It is used to identify methods


        System.out.println();
    }


    static class Geek
    {

        Geek(){}
    }




    public MethodVsConstructor(String  constructorMethod) {
        constructor = constructorMethod;
    }



    public String getConstructor() {
        return constructor;
    }

}
