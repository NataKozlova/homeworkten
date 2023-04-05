package ru.netology.services;

import lombok.Getter;
import lombok.Setter;

public class RadioService {

    @Getter
    private int numberWave;
    private int countWaves;
    @Getter
    @Setter
    public int volume;

    public RadioService(int countWaves) {
        this.countWaves = countWaves;

    }
    public RadioService() {
        countWaves = 10;
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
        if (numberWave > countWaves - 1) {
            numberWave = 0;
        }
    }

    public void prev() {
        numberWave--;
        if (numberWave < 0) {
            numberWave = countWaves - 1;
        }
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


