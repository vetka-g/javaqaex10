package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStationMoreMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(12);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(5);

        int expected = 5;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationLessMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-2);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationUpper() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);
        rad.nextRadioStation();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationMiddle() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(5);
        rad.nextRadioStation();

        int expected = 6;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationLess() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        rad.nextRadioStation();

        int expected = 1;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStationLess() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        rad.prevRadioStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStationMiddle() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(7);
        rad.prevRadioStation();

        int expected = 6;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStationUpper() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);
        rad.prevRadioStation();

        int expected = 8;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLevelVolumeLessMin() {
        Radio rad = new Radio();
        rad.setCurrentLevelVolume(-2);

        int expected = 0;
        int actual = rad.getCurrentLevelVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLevelVolume() {
        Radio rad = new Radio();
        rad.setCurrentLevelVolume(64);

        int expected = 64;
        int actual = rad.getCurrentLevelVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLevelVolumeMoreMax() {
        Radio rad = new Radio();
        rad.setCurrentLevelVolume(120);

        int expected = 0;
        int actual = rad.getCurrentLevelVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseLevelVolumeLess() {
        Radio rad = new Radio();
        rad.setCurrentLevelVolume(0);
        rad.increaseLevelVolume();

        int expected = 1;
        int actual = rad.getCurrentLevelVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseLevelVolumeMiddle() {
        Radio rad = new Radio();
        rad.setCurrentLevelVolume(49);
        rad.increaseLevelVolume();

        int expected = 50;
        int actual = rad.getCurrentLevelVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseLevelVolumeUpper() {
        Radio rad = new Radio();
        rad.setCurrentLevelVolume(100);
        rad.increaseLevelVolume();

        int expected = 100;
        int actual = rad.getCurrentLevelVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseLevelVolumeUpper() {
        Radio rad = new Radio();
        rad.setCurrentLevelVolume(100);
        rad.decreaseLevelVolume();

        int expected = 99;
        int actual = rad.getCurrentLevelVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseLevelVolumeMiddle() {
        Radio rad = new Radio();
        rad.setCurrentLevelVolume(37);
        rad.decreaseLevelVolume();

        int expected = 36;
        int actual = rad.getCurrentLevelVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseLevelVolumeLess() {
        Radio rad = new Radio();
        rad.setCurrentLevelVolume(0);
        rad.decreaseLevelVolume();

        int expected = 0;
        int actual = rad.getCurrentLevelVolume();

        Assertions.assertEquals(expected, actual);
    }
}
