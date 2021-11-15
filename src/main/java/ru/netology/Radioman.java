package ru.netology;

public class Radioman {
    public int currentWave;
    public int currentVolume;


    public int getCurrentWave() {

        return currentWave;
    }

    public void setCurrentWave(int currentWave) {
        if (currentWave < 0) {
            return;
        }
        if (currentWave > 9) {
            return;
        }
        this.currentWave = currentWave;
    }

    public void next() {
        if (currentWave < 9) {
            currentWave++;
        } else {
            currentWave = 0;
        }

    }

    public void priveous() {
        if (currentWave > 0) {
            currentWave--;
        } else {
            currentWave = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void lowVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
