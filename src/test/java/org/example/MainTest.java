package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isPasswordLongEnough_ShouldReturnTrue_WhenPasswordIsLongEnough() {
        assertTrue(Main.isPasswordLongEnough("password"));
    }

    @Test
    void isPasswordLongEnough_ShouldReturnFalse_WhenPasswordIsToShort() {
        assertFalse(Main.isPasswordLongEnough("pass"));
    }
}