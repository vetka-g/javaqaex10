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
}

