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
}