package com.neo.program;

public class PasswordChecker {
    public boolean valPass(String password) {

        if (password.length() > 7) {
            if (checkPass(password)) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            System.out.println("Password too short");
            return false;
        }
    }

    public boolean checkPass(String password) {
        boolean hasNum = false; boolean hasCap = false; boolean hasLow = false; char c;
        for (int i = 0; i < password.length(); i++) {
            c = password.charAt(i);
            if (Character.isDigit(c))
            {
                hasNum = true;
            }
            else if (Character.isUpperCase(c)) {
                hasCap = true;
            }
            else if (Character.isLowerCase(c)) {
                hasLow = true;
            }
            if (hasNum && hasCap && hasLow) {
                return true;
            }
        }   return false;
    }
}
