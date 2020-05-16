package com.neo.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnterPassword {


    public static void main(String[] args) throws IOException {


        String s1, s2, s3, s4;



        PasswordChecker program = new PasswordChecker();


        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        String pass = br.readLine();

        do {

            if (program.valPass(pass)) {
                br.readLine();
            } else {
                System.out.println("Denied");
            }

        } while (program.valPass(pass));





//        program.valPassword(pass);
//        program.checkPass(pass);

    }
}
