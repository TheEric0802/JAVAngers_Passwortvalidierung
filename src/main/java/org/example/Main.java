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

    public static final String[] commonPasswords = {
        "123456", "password", "12345678", "qwerty", "123456789", "12345", "1234", "111111", "1234567", "dragon",
        "123123", "baseball", "abc123", "football", "monkey", "letmein", "696969", "shadow", "master", "666666",
        "qwertyuiop", "123321", "mustang", "1234567890", "michael", "654321", "pussy", "superman", "1qaz2wsx",
        "7777777", "fuckyou", "121212", "000000", "qazwsx", "123qwe", "killer", "trustno1", "jordan", "jennifer",
        "zxcvbnm", "asdfgh", "hunter", "buster", "soccer", "harley", "batman", "andrew", "tigger", "sunshine",
        "iloveyou", "fuckme", "2000", "charlie", "robert", "thomas", "hockey", "ranger", "daniel", "starwars",
        "klaster", "112233", "george", "asshole", "computer", "michelle", "jessica", "pepper", "1111", "zxcvbn",
        "555555", "11111111", "131313", "freedom", "777777", "pass", "fuck", "maggie", "159753", "aaaaaa",
        "ginger", "princess", "joshua", "cheese", "amanda", "summer", "love", "ashley", "6969", "nicole",
        "chelsea", "biteme", "matthew", "access", "yankees", "987654321", "dallas", "austin", "thunder", "taylor",
        "matrix"
    };

    public static boolean isPasswordCommon(String password) {
        for (String commonPassword : commonPasswords) {
            if (password.equals(commonPassword.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public static final String specialCharacters = "!\"§$%&/()=?`´}][{.:,;-_#'+*~<>|";

    public static boolean doesPasswordContainSpecialCharacter(String password) {
        for (char c : password.toCharArray()) {
            for (char specialCharacter : specialCharacters.toCharArray()) {
                if (c == specialCharacter) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String generatePassword() {
        return "";
    }

    public static boolean isValidPassword(String password) {
        return isPasswordLongEnough(password) && doesPasswordContainNumber(password) && doesPasswordContainLowercaseAndUppercase(password) && !isPasswordCommon(password) && doesPasswordContainSpecialCharacter(password);
    }
}