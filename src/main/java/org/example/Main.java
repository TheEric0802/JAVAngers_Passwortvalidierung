package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public static final int minPasswordLength = 8;

    public static boolean isPasswordLongEnough(String password) {
        return password.length() >= minPasswordLength;
    }

    public static boolean doesPasswordContainNumber(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean doesPasswordContainLowercaseAndUppercase(String password) {
        boolean hasLowercase = false;
        boolean hasUppercase = false;
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isUpperCase(c)) {
                hasUppercase = true;
            }
        }
        return hasLowercase && hasUppercase;
    }

    public static boolean isPasswordCommon(String password) {
        return false;
    }
}