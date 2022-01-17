package com.teachmeskills.lesson_13.task_2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Task2 {

    public static void main(String[] args) {

        LocalDate finalDate = LocalDate.now();

        while (!isNowTuesday(finalDate)) {
            finalDate = finalDate.plusDays(1);
        }
        System.out.println("Date of next Tuesday: " + finalDate);
    }

    private static boolean isNowTuesday(LocalDate date) {
        return date.getDayOfWeek().equals(DayOfWeek.TUESDAY);
    }
}
