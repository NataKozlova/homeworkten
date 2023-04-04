package ru.netology.services;import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Locale;

public class RadioServiceTest {
    @ParameterizedTest
    @CsvSource({
            "-1,0",
            "5,5",
            "10,9"
    })
    void shouldReturnCorrectNumberWave(int numberWave, int expectedNumberWave) {
        RadioService service = new RadioService();
        service.setNumberWave(numberWave);
        int actualNumberWave = service.getNumberWave();
        //int expectedNumberWave = 0;
        Assertions.assertEquals(expectedNumberWave, actualNumberWave);
    }

    @ParameterizedTest
    @CsvSource({
            "5,6",
            "9,0",
            "0,1"
    })
    void shouldReturnCorrectNextWave(int numberWave, int expectedNumberWave) {
        RadioService service = new RadioService();
        service.setNumberWave(numberWave);
        service.next();
        int actualNumberWave = service.getNumberWave();
        Assertions.assertEquals(expectedNumberWave, actualNumberWave);

    }

    @ParameterizedTest
    @CsvSource({
            "9,8",
            "0,9"
    })
    void shouldReturnCorrectPrevWave(int numberWave, int expectedNumberWave) {
        RadioService service = new RadioService();
        service.setNumberWave(numberWave);
        service.prev();
        int actualNumberWave = service.getNumberWave();
        Assertions.assertEquals(expectedNumberWave, actualNumberWave);

    }

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "100,100"
    })
    void shouldReturnCorrectIncreaseVolume(int volume, int expectedIncreaseVolume) {
        RadioService service = new RadioService();
        service.setVolume(volume);
        service.increaseVolume();
        int actualVolume = service.getVolume();
        Assertions.assertEquals(expectedIncreaseVolume, actualVolume);

    }

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "100,99"
    })
    void shouldReturnCorrectDecreaseVolume(int volume, int expectedDecreaseVolume) {
        RadioService service = new RadioService();
        service.setVolume(volume);
        service.decreaseVolume();
        int actualVolume = service.getVolume();
        Assertions.assertEquals(expectedDecreaseVolume, actualVolume);

    }
}

