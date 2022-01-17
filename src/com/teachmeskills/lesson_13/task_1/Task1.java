package com.teachmeskills.lesson_13.task_1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your date in the format dd.MM.yyyy: ");
        String userDate = sc.nextLine();
        sc.close();

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date date = sdf.parse(userDate);
        DateFormat format2 = new SimpleDateFormat("EEEE", java.util.Locale.ENGLISH);
        String finalDay = format2.format(date);
        System.out.println("Your day of the week: " + finalDay);
    }
}
