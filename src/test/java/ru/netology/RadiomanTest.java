package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {

    @Test
    void multiTestWave() {
        Radioman run = new Radioman();
        run.setCurrentWave(0);
        run.priveous();
        int expected = 9;
        int actual = run.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    void multiTestVolume() {
        Radioman run = new Radioman();
        run.setCurrentVolume(0);
        run.lowVolume();
        int expected = 0;
        int actual = run.getCurrentVolume();
        assertEquals(expected, actual);
    }
}