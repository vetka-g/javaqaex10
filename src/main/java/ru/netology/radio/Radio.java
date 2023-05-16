package ru.netology.radio;

public class Radio {
    private int amountRadioStation = 10;
    private int minRadioStation = 0;
    private int maxRadioStation = amountRadioStation - 1;
    private int currentRadioStation = minRadioStation;
    private int minLevelVolume = 0;
    private int maxLevelVolume = 100;
    private int currentLevelVolume = minLevelVolume;

    public Radio(int amountRadioStation) {
        if (amountRadioStation < minRadioStation) {
            return;
        } else {
            this.amountRadioStation = amountRadioStation;
        }
        this.maxRadioStation = amountRadioStation - 1;
    }

    public Radio() {
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            setCurrentRadioStation(0);
        } else {
            currentRadioStation++;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation == 0) {
            setCurrentRadioStation(maxRadioStation);
        } else {
            currentRadioStation--;
        }
    }

    public int getMinLevelVolume() {
        return minLevelVolume;
    }

    public int getMaxLevelVolume() {
        return maxLevelVolume;
    }

    public int getCurrentLevelVolume() {
        return currentLevelVolume;
    }

    public void setCurrentLevelVolume(int newCurrentLevelVolume) {
        if (newCurrentLevelVolume < minLevelVolume) {
            return;
        }
        if (newCurrentLevelVolume > maxLevelVolume) {
            return;
        }
        currentLevelVolume = newCurrentLevelVolume;
    }

    public void increaseLevelVolume() {
        if (currentLevelVolume < maxLevelVolume) {
            currentLevelVolume = currentLevelVolume + 1;
        }
    }

    public void decreaseLevelVolume() {
        if (currentLevelVolume > minLevelVolume) {
            currentLevelVolume = currentLevelVolume - 1;
        }
    }
}

