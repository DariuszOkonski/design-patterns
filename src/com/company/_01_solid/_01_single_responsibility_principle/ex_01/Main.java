package com.company._01_solid._01_single_responsibility_principle.ex_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to the Application");

        Pair pair = InputProcessor.process();

        if(!ViolationChecker.isValid(pair)) {
            System.out.println("One of the input is invalid...");
            return;
        }

        int firstInteger = Integer.parseInt(pair.getFirst());
        int secondInteger = Integer.parseInt(pair.getSecond());

        int result = Operation.execute(firstInteger, secondInteger);


        System.out.println("The result is: " + result);
        System.out.println("End of the application");


    }
}
