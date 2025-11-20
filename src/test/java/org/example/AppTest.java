package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void generateNumbersOutput_threeNumbers() {
        String expected = String.join(System.lineSeparator(),
                "i = 1",
                "i = 2",
                "i = 3");

        String actual = App.generateNumbersOutput(3);

        assertEquals(expected, actual);
    }

    @Test
    void generateNumbersOutput_zeroNumbers() {
        String expected = "";
        String actual = App.generateNumbersOutput(0);
        assertEquals(expected, actual);
    }
}
