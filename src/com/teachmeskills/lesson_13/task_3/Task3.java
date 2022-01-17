package com.teachmeskills.lesson_13.task_3;

import java.util.Scanner;

public class Task3 {

    private static FuncInterface<String> workingWithString = line -> new StringBuilder(line).reverse().toString();
    private static FuncInterface<Integer> workingWithInt = number -> {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 (for string) or 2 (for int): ");
        String inputNum = sc.next();

        if (inputNum.equals("1")) {
            Scanner scFor1 = new Scanner(System.in);
            System.out.println("Enter your line to reverse: ");
            String inputLine = sc.next();
            System.out.println("Result: " + workingWithString.someWork(inputLine));

        } else if (inputNum.equals("2")) {
            System.out.println("Enter your number to find factorial: ");
            String numberForFactorial = sc.next();
            System.out.println("Result " + workingWithInt.someWork(Integer.valueOf(numberForFactorial)));

        } else {
            System.out.println("You entered wrong number!");
        }
        sc.close();
    }
}
