package ru.netology.services;

public class RadioService {

    private int numberWave;
    public int volume;

    public int getNumberWave() {
        return numberWave;
    }

    public void setNumberWave(int wave) {
        if (wave > 9) {
            numberWave = 9;
        } else if (wave < 0) {
            numberWave = 0;
        } else {
            numberWave = wave;
        }
    }

    public void next() {
        numberWave++;
        if (numberWave > 9) {
            numberWave = 0;
        }
    }

    public void prev() {
        numberWave--;
        if (numberWave < 0) {
            numberWave = 9;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int vol) {
        volume = vol;
    }

    public void increaseVolume() {
        volume++;
        if (volume > 100) {
            volume = 100;
        }
    }

    public void decreaseVolume() {
        volume--;
        if (volume < 0) {
            volume = 0;
        }
    }

}


