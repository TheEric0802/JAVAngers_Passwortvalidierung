package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isPasswordLongEnough_ShouldReturnTrue_WhenPasswordIsLongEnough() {
        assertTrue(Main.isPasswordLongEnough("password1234567890"));
    }

    @Test
    void isPasswordLongEnough_ShouldReturnFalse_WhenPasswordIsToShort() {
        assertFalse(Main.isPasswordLongEnough("pass"));
    }


    @Test
    void isPasswordLongEnough_ShouldReturnTrue_WhenPasswordIsM4ximilian22() {
        assertTrue(Main.isPasswordLongEnough("M4ximilian22"));
    }

    @Test
    void isPasswordLongEnough_ShouldReturnFalse_WhenPasswordIsABC() {
        assertFalse(Main.isPasswordLongEnough("ABC"));
    }

    @Test
    void doesPasswordContainNumber_ShouldReturnFalse_WhenPasswordDoesNotContainNumber() {
        assertFalse(Main.doesPasswordContainNumber("password"));
    }

    @Test
    void doesPasswordContainNumber_ShouldReturnTrue_WhenPasswordContainsNumber() {
        assertTrue(Main.doesPasswordContainNumber("password1"));
    }

    @Test
    void doesPasswordContainNumber_ShouldReturnTrue_WhenPasswordIsNumberOnly() {
        assertTrue(Main.doesPasswordContainNumber("1234"));
    }

    @Test
    void doesPasswordContainLowercaseAndUppercase_ShouldReturnFalse_WhenPasswordIsLowercase() {
        assertFalse(Main.doesPasswordContainLowercaseAndUppercase("password"));
    }

    @Test
    void doesPasswordContainLowercaseAndUppercase_ShouldReturnFalse_WhenPasswordIsUppercase() {
        assertFalse(Main.doesPasswordContainLowercaseAndUppercase("PASSWORD"));
    }

    @Test
    void doesPasswordContainLowercaseAndUppercase_ShouldReturnTrue_WhenPasswordIsLowercaseAndUppercase() {
        assertTrue(Main.doesPasswordContainLowercaseAndUppercase("Password"));
    }
}