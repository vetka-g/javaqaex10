package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void shouldSetRadioStation() {

        Radio rad = new Radio();

        rad.currentRadioStation = 1;

        int expected = 1;
        int actual = rad.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }
}
