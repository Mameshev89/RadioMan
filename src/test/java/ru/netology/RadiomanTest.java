package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {

    @Test
    void multiTestWave() {
        Radioman run = new Radioman();
        run.setCurrentWave(9);
        run.next();
        int expected = 0;
        int actual = run.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    void multiTestVolume() {
        Radioman run = new Radioman();
        run.setCurrentVolume(10);
        run.increaseVolume();
        int expected = 10;
        int actual = run.getCurrentVolume();
        assertEquals(expected, actual);
    }
}