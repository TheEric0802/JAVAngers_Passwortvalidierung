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
        return false;
    }

    public static boolean doesPasswordContainLowercaseAndUppercase(String password) {
        return false;
    }

    public static boolean isPasswordCommon(String password) {
        return false;
    }
}