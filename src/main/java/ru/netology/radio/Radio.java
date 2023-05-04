package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int currentLevelVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation == 9) {
            setCurrentRadioStation(0);
        } else {
            currentRadioStation++;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation == 0) {
            setCurrentRadioStation(9);
        } else {
            currentRadioStation--;
        }
    }

    public int getCurrentLevelVolume() {
        return currentLevelVolume;
    }

    public void setCurrentLevelVolume(int newCurrentLevelVolume) {
        if (newCurrentLevelVolume < 0) {
            return;
        }
        if (newCurrentLevelVolume > 100) {
            return;
        }
        currentLevelVolume = newCurrentLevelVolume;
    }

    public void increaseLevelVolume() {
        if (currentLevelVolume < 100) {
            currentLevelVolume = currentLevelVolume + 1;
        }
    }

    public void decreaseLevelVolume() {
        if (currentLevelVolume > 0) {
            currentLevelVolume = currentLevelVolume - 1;
        }
    }
}

