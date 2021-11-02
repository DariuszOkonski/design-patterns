package com.company._01_solid._01_single_responsibility_principle.ex_01;

import java.util.Scanner;

public class InputProcessor {
    public static Pair process() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        String firstNumber = scanner.nextLine();

        System.out.println("Enter the second number: ");
        String secondNumber = scanner.nextLine();

        scanner.close();

        return new Pair(firstNumber, secondNumber);
    }
}
