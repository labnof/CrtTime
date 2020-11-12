package com.github.labnof.CrtTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

class ShowCurrentTimeTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void actionPerformed() {
    }

    @Test
    void getCurrentDate() {
        Date currentDateTest = new Date();
        Date currentDateShowCurrentTime = ShowCurrentTime.getCurrentDate();
        assertDatesAlmostEqual(currentDateTest,currentDateShowCurrentTime);
    }

    private void assertDatesAlmostEqual(Date date1, Date date2) {
        assertTrue("Dates aren't close enough to each other!",
                Math.abs(date2.getTime() - date1.getTime()) < 1000);
    }

    @Test
    void getCurrentTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String time = formatter.format(new Date());
        String currentDateShowCurrentTime = ShowCurrentTime.getCurrentTime();
        assertEquals("Time not similar", time , currentDateShowCurrentTime);

    }

    @Test
    void showNotification() {
    }
}